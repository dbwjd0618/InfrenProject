package hello.servlet.web.frontcontroller.ex1;

import java.util.Map;

import hello.servlet.web.frontcontroller.ModelView2;

public interface ControllerEX1 {

	ModelView2 process(Map<String, String> paramMap);
}
