package hello.servlet.web.frontcontroller.ex1.controller;

import java.util.List;
import java.util.Map;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import hello.servlet.web.frontcontroller.ModelView2;
import hello.servlet.web.frontcontroller.ex1.ControllerEX1;

public class MemberListController implements ControllerEX1 {

	MemberRepository memberRepository = MemberRepository.getInstance();
	
	@Override
	public ModelView2 process(Map<String, String> paramMap) {
		List<Member> members = memberRepository.findAll();
		
		ModelView2 mv = new ModelView2("members");
		mv.getModel().put("members", members);
		
		return mv;
	}

}
