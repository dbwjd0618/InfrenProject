package hello.servlet.web.frontcontroller.ex1;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hello.servlet.web.frontcontroller.ModelView2;
import hello.servlet.web.frontcontroller.MyView;
import hello.servlet.web.frontcontroller.ex1.controller.MemberFormController;
import hello.servlet.web.frontcontroller.ex1.controller.MemberListController;
import hello.servlet.web.frontcontroller.ex1.controller.MemberSaveController;

@WebServlet(name = "fontControllerServlet", urlPatterns = "/front-controller/ex1/*")
public class FrontControllerServlet extends HttpServlet {
	
	Map<String, ControllerEX1> controllerMap = new HashMap<>();
	
	public FrontControllerServlet() {
		controllerMap.put("/front-controller/ex1/members/new-form", new MemberFormController());
		controllerMap.put("/front-controller/ex1/members/save", new MemberSaveController());
		controllerMap.put("/front-controller/ex1/members", new MemberListController());
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("FrontControllerServlet.service");
		
		// 1. 요청 들어온 URI 값 가져오기
		String requestURI = request.getRequestURI();
		
		// 2. 가져온 URI 값으로 일치하는 controller 조회하기
		ControllerEX1 controller = controllerMap.get(requestURI);
		
		// 3. controller가 없다면, 404 띄우기
		if(null == controller) {
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
		}
		
		// 4. 렌더링 하기
		// 요청 시 들어온 데이터를 map으로 변환 (createParamMap)
		Map<String, String> paramMap = createParamMap(request);
		
		// 요청된 URI에 따라 세팅된 controller의 process 메소드를 실행하여 modelview 객체를 담기
		ModelView2 mv = controller.process(paramMap);
		String viewName = mv.getViewName();
		
		// ModeView에 담긴 viewName(ex:new-form) 가져와서 경로 만들기 (viewResolver)
		MyView view = viewResolver(viewName);
		view.render(mv.getModel(), request, response);
	}

	private MyView viewResolver(String viewName) {
		return new MyView("/WEB-INF/views/" + viewName + ".jsp");
	}

	private Map<String, String> createParamMap(HttpServletRequest request) {
		Map<String, String> paramMap = new HashMap<>();
		request.getParameterNames().asIterator()
				.forEachRemaining(paramName -> paramMap.put(paramName, request.getParameter(paramName)));
		
		return paramMap;
	}

}


















