package hello.core.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import hello.core.annotation.MainDiscountPolicy;
import hello.core.discount.DiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import lombok.RequiredArgsConstructor;

@Component
// final이 붙은 객체를 가지고 생성자를 만들어주는 애노테이션
//@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

	/**
	 * 인터페이스에만 의존하는게 아니라 구현체인 FixDiscountPolicy도 의존하고 있다. -> OCP 위반
	 */
//	private final MemberRepository memberRepository = new MemoryMemberRepository();
//	private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
	
	/**
	 * 인터페이스만 의존하도록 코드를 변경했다.
	 */
	private final MemberRepository memberRepository;
	private final DiscountPolicy discountPolicy;
	
	@Autowired
	public OrderServiceImpl(MemberRepository memberRepository, @MainDiscountPolicy DiscountPolicy discountPolicy) {
		this.memberRepository = memberRepository;
		this.discountPolicy = discountPolicy;
	}

	@Override
	public Order createOrder(Long memberId, String itemName, int itemPrice) {
		Member member = memberRepository.findById(memberId);
		int discountPrice = discountPolicy.discount(member, itemPrice);
		
		return new Order(memberId, itemName, itemPrice, discountPrice);
	}

	public MemberRepository getMemberRepository() {
		return memberRepository;
	}
	
}
