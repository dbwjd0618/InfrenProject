package hello.hellospring.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;

@Transactional
public class MemberService {

	private final MemberRepository memberRepository;
	
	// memberRepository를 외부에서 넣어줌 -> Dependency Injection
	// 같은 memberRepository를 사용하기 위함
	public MemberService(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}
	
	/**
	 * 회원가입
	 */
	public Long join(Member member) {
		// 같은 이름이 있는 중복 회원은 안됨
		validateDuplicateMember(member);
		memberRepository.save(member);
		return member.getId();
	}
	
	private void validateDuplicateMember(Member member) {
		memberRepository.findByName(member.getName())
			.ifPresent(m -> {
				throw new IllegalStateException("이미 존재하는 회원입니다.");
			});
	}
	
	/**
	 * 전체 화면 조회
	 */
	public List<Member> findMembers() {
		return memberRepository.findAll();
	}
	
	/**
	 * 회원 하나 조회 
	 */
	public Optional<Member> findOne(Long memberId) {
		return memberRepository.findById(memberId);
	}
	
	public Optional<Member> findByName(String memberName) {
		return memberRepository.findByName(memberName);
	}
}
