package hello.hellospring.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import hello.hellospring.domain.Member;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository{

	// JpaRepository에서 공통화할 수 없는 부분
	@Override
	// select m from Member m where m.name = ?
	Optional<Member> findByName(String name);
	
	// 메소드명에 규칙이 있어, 명을 보고 조회 기능이 제공된다.
//	Optional<Member> findByNameAndId(String name, Long id);
}
