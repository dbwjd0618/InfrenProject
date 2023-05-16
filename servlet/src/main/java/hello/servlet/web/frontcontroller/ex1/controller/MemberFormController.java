package hello.servlet.web.frontcontroller.ex1.controller;

import java.util.Map;

import hello.servlet.web.frontcontroller.ModelView2;
import hello.servlet.web.frontcontroller.ex1.ControllerEX1;

public class MemberFormController implements ControllerEX1 {

	@Override
	public ModelView2 process(Map<String, String> paramMap) {
		return new ModelView2("new-form");
	}

	
}
