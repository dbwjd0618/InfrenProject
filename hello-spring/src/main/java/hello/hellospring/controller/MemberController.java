package hello.hellospring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;

// @Controller : spring 컨테이너가 스프링 처음에 뜰 때 memberController 객체를 생성해서 스프링에 넣어두고 관리함
@Controller
public class MemberController {

	// @Autowired : 스프링 컨테이너에 있는 memberService 가져다가 연결해준다.
	
	// new를 사용하면 다른 컨트롤러에서도 MemberService를 가져다 쓸 수 있게 되어버린다.
	// @Autowired : 필드주입
	private MemberService memberService;

	// @Autowired : 세터주입, memberController를 호출했을 때 public으로 열려 노출됨.
//	public void setMemberService(MemberService memberService) {
//		this.memberService = memberService;
//	}
	
	@Autowired 
	// 생성자 주입, spring container에 등록된 memberService를 Controller가 생성될 때 넣어준다.
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	
	@GetMapping("/members/new")
	public String createForm() {
		return "members/createMemberForm";
	}
	
	@PostMapping("/members/new")
	public String create(MemberForm form) {
		Member member = new Member();
		member.setName(form.getName());
		
		memberService.join(member);
		
		return "redirect:/";
	}
	
	@GetMapping("/members")
	public String list(Model model) {
		List<Member> members = memberService.findMembers();
		model.addAttribute("members", members);
		return "members/memberList";
	}
}
