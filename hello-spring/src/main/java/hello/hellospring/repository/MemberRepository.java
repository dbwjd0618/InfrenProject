package hello.hellospring.repository;

import java.util.List;
import java.util.Optional;

import hello.hellospring.domain.Member;

public interface MemberRepository {
	Member save(Member member);
	// optional은 null을 처리할 수 있다.
	Optional<Member> findById(Long id);
	Optional<Member> findByName(String name);
	List<Member> findAll();
}
