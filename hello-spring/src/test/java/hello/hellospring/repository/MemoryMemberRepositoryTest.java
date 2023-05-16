package hello.hellospring.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.annotation.Commit;

import hello.hellospring.domain.Member;

public class MemoryMemberRepositoryTest {
	
	MemoryMemberRepository repository = new MemoryMemberRepository();
	
	@AfterEach
	// 테스트할 때 메소드의 실행 순서를 지키지 않기 때문에 하나의 저장소를 한번 비워 에러가 발생하지 않도록 한다.
	// AfterEach는 하나의 테스트가 끝날 때 마다 실행되는 어노테이션이다.
	public void afterEach() {
		repository.clearStore();
	}
	
	@Test
	public void save() {
		Member member = new Member();
		member.setName("spring");
		
		repository.save(member);
		
		Member result = repository.findById(member.getId()).get();
		assertThat(member).isEqualTo(result);
	}
	
	@Test
	public void findByName() {
		Member member1 = new Member();
		member1.setName("spring1");
		repository.save(member1);
		
		Member member2 = new Member();
		member2.setName("spring2");
		repository.save(member2);
		
		Member result = repository.findByName("spring1").get();
		assertThat(result).isEqualTo(member1);
	}
	
	@Test
	public void findAll() {
		Member member1 = new Member();
		member1.setName("spring1");
		repository.save(member1);
		
		Member member2 = new Member();
		member2.setName("spring2");
		repository.save(member2);
		
		List<Member> result = repository.findAll();
		assertThat(result.size()).isEqualTo(2);
	}
}
