package aspectproject.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class Logger {
	
	// create a dummy method to enable reusable pointcut
	// double dots in parameter list are wildcards telling making this pointcut work for any snap() method
	// asterisks are wildcards and in this case allow any return type and any Camera method
	@Pointcut("execution(* aspectproject.spring.aop.Camera.*(..))")
	public void cameraSnap() {
		
	}
	
	
	// use asterisk wildcard for return type
	@Pointcut("execution(* aspectproject.spring.aop.Camera.snap(String))")
	public void cameraSnapName() {
		
	}
	
	
	// this pointcut works for any return type, any package name, any class name or any method name with any arguments
	@Pointcut("execution(* *.*.*(..))")
	public void cameraRelatedAction() {
		
	}
	

	@Before("cameraSnap()")
	public void aboutToTakePhoto() {
		
		System.out.println("About to take photo...");
	}
	
	
	@Before("cameraSnapName()")
	public void aboutToTakePhotoWithName() {
		
		System.out.println("About to take photo with name...");
	}
	
	
	@Before("cameraRelatedAction()")
	public void aboutToDoCameraRelatedAction() {
		
		System.out.println("Doing something related to cameras...");
	}

}

