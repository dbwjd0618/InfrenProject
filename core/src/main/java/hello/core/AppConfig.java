package hello.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

@Configuration
public class AppConfig {

	@Bean
	// memberRepository의 역할과 구현 분리
	public MemberService memberService() {
		System.out.println("Call AppConfig.memberService");
		return new MemberServiceImpl(memberRepository());
	}
	
	@Bean
	public MemoryMemberRepository memberRepository() {
		System.out.println("Call AppConfig.memberRepository");
		return new MemoryMemberRepository();
	}

	@Bean
	// orderService의 역할과 구현 분리
	public OrderService orderService() {
		System.out.println("Call AppConfig.orderServices");
		return new OrderServiceImpl(memberRepository(), discountPolicy());
	}
	
	@Bean
	public DiscountPolicy discountPolicy() {
//		return new FixDiscountPolicy();
		return new RateDiscountPolicy();
	}
}
