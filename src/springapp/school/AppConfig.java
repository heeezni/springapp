package springapp.school;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration // XML을 대신하여 스프링 컨테이너에게 빈을 관리하도록 부탁하는 설정 파일
@EnableAspectJAutoProxy
@ComponentScan("springapp.school") // 지정된 패키지를 대상으로 메모리에 올리겠다!
public class AppConfig {
	
	@Bean
	public Bell bell() {
		return new Bell();
	}
	
	@Bean
	public Student student() { //<bean class="~~~.Student" id="student"></bean>
		return new Student();
	}
}
