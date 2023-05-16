package hello.hellospring.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;

// 스프링 컨테이너와 테스트를 함께 실행
@SpringBootTest

// 테스트 후 항상 롤백됨
@Transactional
public class MemberServiceIntegrationTest {

	@Autowired MemberService memberService;
	@Autowired MemberRepository memberRepository;
	
	@Test
	public void 회원가입() {
		// given(상황이 주어짐)
		Member member = new Member();
		member.setName("spring100");
		
		// when(실행했을 때)
		Long saveId = memberService.join(member);
		
		// then(결과가 나와야 함)
		Member findMember = memberService.findOne(saveId).get();
		assertThat(member.getName()).isEqualTo(findMember.getName());
	}
	
//	@Test
	public void 중복_회원_예외() {
		// given
		Member member1 = new Member();
		member1.setName("spring");
		
		Member member2 = new Member();
		member2.setName("spring");
		
		// when
		memberService.join(member1);
		IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.join(member2));
		assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
	}

//	@Test
	public void 이름_조회() {
		// given
		Member member1 = new Member();
		member1.setName("spring100");
		
		Optional<Member> result = memberService.findByName(member1.getName())
				.stream()
				.findAny();
		System.out.println("id = " + result.get().getId());
		System.out.println("name = " + result.get().getName());
	}
}

