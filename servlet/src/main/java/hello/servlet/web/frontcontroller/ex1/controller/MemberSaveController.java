package hello.servlet.web.frontcontroller.ex1.controller;

import java.util.Map;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import hello.servlet.web.frontcontroller.ModelView2;
import hello.servlet.web.frontcontroller.ex1.ControllerEX1;

public class MemberSaveController implements ControllerEX1 {

	MemberRepository memberRepository = MemberRepository.getInstance();
	
	@Override
	public ModelView2 process(Map<String, String> paramMap) {
		String username = paramMap.get("username");
		int age = Integer.parseInt(paramMap.get("age"));
		
		Member member = new Member(username, age);
		memberRepository.save(member);
		
		ModelView2 mv = new ModelView2("save-result");
		mv.getModel().put("member", member);
		
		return mv;
	}

}
