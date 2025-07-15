package springapp.school;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Aspect 지향 프로그래밍의 개념 및 라이브러리는 스프링 것이 아님
 * 스프링이  개발되기 이전에 이미 IT분야에 있던 개념임
 * 그리고 자바 기반의 AOP라이브러리도 이미 aspectj라고 불리는 것이 있었음
 * 스프링이 차용한 것임
 * */
@Aspect
@Component // 스프링이 이 객체를 자동으로 메모리에 올림
public class BellAspect {
	
	@Autowired // 자동 주입 (스프링 컨테이너가 보유한 Bell 빈을 아래 멤버변수에 자동으로 주입)
	private Bell bell; // 공통코드, 횡단적 관심사
	
	
	@Before("execution(* Student.*(..))") // 이 벨이 학생이 호출하는 메서드 전에 호출할 것이다 
	public void ringBell() {
		bell.sound(); // 벨이 보유한 공통 메서드 호출
	}
	
}
