package aspectproject.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
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
	
//	@Pointcut("within(aspectproject.spring.aop..*)")
//	public void somePointcut() {
//		
//	}
//	
//	
//	@Before("somePointcut()")
//	public void somePointcutDemo() {
//		System.out.println("*********** Before Demo ***********");
//	}
	
	
//	@Pointcut("target(org.springframework.stereotype.Component)")
//	public void somePointcut() {
//		
//	}
//	
//	
//	@Before("somePointcut()")
//	public void somePointcutDemo() {
//		System.out.println("*********** Before Demo ***********");
//	}
	
	
//	@Pointcut("@annotation(java.lang.Deprecated)")
//	public void somePointcut() {
//		
//	}
//	
//	
//	@Before("somePointcut()")
//	public void somePointcutDemo() {
//		System.out.println("*********** Before Demo ***********");
//	}	
	
	
//	@Pointcut("@args(org.springframework.stereotype.Component)")
//	public void somePointcut() {
//		
//	}
//	
//	
//	@Before("somePointcut()")
//	public void somePointcutDemo() {
//		System.out.println("*********** Before Demo ***********");
//	}	
	
	
//	@Pointcut("args(int, *)")	
//	@Pointcut("args(int, ..)")
//	@Pointcut("args(int, double)")
//	@Pointcut("target(aspectproject.spring.aop.Camera)")
	
	@Pointcut("args(exposure, aperture)")
	public void somePointcut(int exposure, double aperture) {
		
	}
	
	/*
	@Before("somePointcut(exposure, aperture)")
	public void somePointcutDemo(JoinPoint jp, int exposure, double aperture) {
		System.out.println("*********** Before Demo ***********");
		

		System.out.printf("exposure %d, apertuer %.2f\n", exposure, aperture);
		
	}	*/
	
	
	@Pointcut("target(aspectproject.spring.aop.Camera)")
	public void targetCamera() {
		
	}
	
	
	@Before("targetCamera() && somePointcut(exposure, aperture)")
	public void somePointcutDemo(int exposure, double aperture) {
		System.out.println("***** Before Demo *****");
		
		System.out.printf("exposure %d, aperture %.2f\n", exposure, aperture);
	}
		
	
	@After("within(aspectproject.spring.aop.Camera)")
	public void someAfterAdvice() {
		
		System.out.println("***** After advice running *****");
	}
			
	
	
/*	@Pointcut("bean(*a*")
	public void somePointcut() {
		
	}
	
	
	@Before("somePointcut()")
	public void somePointcutDemo() {
		System.out.println("*********** Before Demo ***********");
	}	
*/
	
/*
	@Pointcut("within(aspectproject.spring.aop.*)")
	public void withinDemo() {
		
	}
*/
	
/*	
	// use asterisk wildcard for return type
	@Pointcut("execution(* aspectproject.spring.aop.Camera.snap(String))")
	public void cameraSnapName() {
		
	}
	
	
	// this pointcut works for any return type, any package name, any class name or any method name with any arguments
	@Pointcut("execution(* *.*(..))")
	public void cameraRelatedAction() {
		
	}
*/

/*
	@Before("withinDemo()")
	public void withinDemoAdvice() {
		
		System.out.println("[Before advice] About to take photo...");
	}
	
	// "this" target is more specific than within or target
	@Pointcut("this(aspectproject.spring.aop.ICamera)")
	public void thisDemo() {
		
	}
	
	
	@Before("thisDemo()")
	public void thisDemoAdvice() {
		System.out.println("******* This Demo *******");
	}	
*/
	
	/*
	@After("cameraSnap()")
	public void afterAdvice() {
		
		System.out.println("[After advice] Just took a photo...");
	} */
	
	/*
	@AfterReturning("cameraSnap()")
	public void afterReturningAdvice() {
		
		System.out.println("[After returning advice] Just took a photo...");
	} */
	
	/*
	@AfterThrowing("cameraSnap()")
	public void afterThrowingAdvice() {
		
		System.out.println("[After throwing an exception advice] Just took a photo...");
	} */
	
	/*
	@Around("cameraSnap()")
	public void aroundAdvice(ProceedingJoinPoint joinPoint) {
		
		System.out.println("Around advice (before)");
		
		try {
			joinPoint.proceed();
		} catch (Throwable e) {
			System.out.println("In around advice: " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("Around advice (after)");
	} */	
	
/*	
	@Before("cameraSnapName()")
	public void aboutToTakePhotoWithName() {
		
		System.out.println("About to take photo with name...");
	}
	
	
	@Before("cameraRelatedAction()")
	public void aboutToDoCameraRelatedAction() {
		
		System.out.println("Doing something related to cameras...");
	}
*/

/*	
	@Pointcut("target(aspectproject.spring.aop.ICamera)")
	public void targetDemo() {		
	}
	
	
	@Before("targetDemo()")
	public void targetDemoAdvice() {
		System.out.println("******** Target Demo ********");
	}
*/
	

}

