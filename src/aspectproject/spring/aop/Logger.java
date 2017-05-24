package aspectproject.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class Logger {
	
	// create a dummy method to enable reusable pointcut
	@Pointcut("execution(void aspectproject.spring.aop.Camera.snap())")
	public void cameraSnap() {
		
	}

	@Before("cameraSnap()")
	public void aboutToTakePhoto() {
		
		System.out.println("About to take photo...");
	}
}

