package hello.core.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import hello.core.common.MyLogger;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class LogDemoController {

	private final LogDemoService logDemoService;
	// MyLogger를 주입받는 것이 아니라, MyLogger를 찾을 수 있는 (DependencyLookup(DL))애가 주입이 된 것
	private final MyLogger myLogger;
	
	@RequestMapping("log-demo")
	@ResponseBody
	public String logDemo(HttpServletRequest request) {
		String requestURL = request.getRequestURL().toString();
		System.out.println("myLogger = " + myLogger.getClass());
		
		// 주입 시점에 주입 받을 수 있다.
		myLogger.setRequestURL(requestURL);
		
		myLogger.log("controller test");
		logDemoService.logic("testId");
		return "OK";
	}
}
