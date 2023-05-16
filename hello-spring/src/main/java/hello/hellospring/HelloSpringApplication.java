package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class HelloSpringApplication {
	/**
	 * HelloSpringApplication class를 넣어주면 
	 * @SpringBootApplication 을 실행시키면서
	 * SpringBootApplication을 실행시켜준다.
	 * 
	 * 띄우면서 tomcat이라는 웹서버를 내장하고 있어 자체적으로 띄우면서 스프링 부트에 같이 올라간다.
	 *
	 */
	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}

}
