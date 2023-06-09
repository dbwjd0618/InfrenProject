package hello.core.scope;

import static org.assertj.core.api.Assertions.assertThat;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

import hello.core.scope.SingletonTest.SingletonBean;

public class PrototypeTest {

	@Test
	void prototypeBeanFind() {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(PrototypeBean.class);
		
		PrototypeBean prototypeBean1 = ac.getBean(PrototypeBean.class);
		System.out.println("find prototypeBean1");
		
		PrototypeBean prototypeBean2 = ac.getBean(PrototypeBean.class);
		System.out.println("find prototypeBean2");
		
		System.out.println("prototypeBean1 = " + prototypeBean1);
		System.out.println("prototypeBean2 = " + prototypeBean2);
		
		assertThat(prototypeBean1).isNotSameAs(prototypeBean2);
		
		// close가 안됨 : 프로토타입은 종료 메소드가 호출되지 않는다. / 스프링 빈을 생성과 의존관계 주입까지만 관여하기 때문
		ac.close();
	}
	
	@Scope("prototype")
	static class PrototypeBean {
		
		@PostConstruct
		public void init() {
			System.out.println("PrototypeBean.init");
		}
		
		@PreDestroy
		public void destroy() {
			System.out.println("PrototypeBean.destroy");
		}
	}
}
