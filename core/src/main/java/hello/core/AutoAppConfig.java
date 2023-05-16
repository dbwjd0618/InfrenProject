package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;


@Configuration
@ComponentScan(
		//	basePackages = "hello.core.member", // member만 component스캔 대상이 된다.
		
		// 기존 예제 코드를 유지하기 위해(실행은 안되고 코드만 유지) AppConfig에 등록된 Configuration을 제거하기 위해 filter를 사용해서 Configuration이 등록된 클래스를 제외한다.
		excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

//	@Bean(name = "memoryMemberRepository")
//	MemberRepository memberRepository() {
//		return new MemoryMemberRepository();
//	}
	
}
