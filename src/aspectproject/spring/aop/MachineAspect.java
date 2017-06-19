package aspectproject.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MachineAspect {

	@DeclareParents(value="aspectproject.spring.aop.*", defaultImpl=aspectproject.spring.aop.Machine.class)
	private IMachine machine;
	
	@Around("within(aspectproject.spring.aop.*)")
	public void runMachine(ProceedingJoinPoint jp) {
		
		System.out.println("Running...");
		try {
			jp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
			
		}
		System.out.println("...completed.");
	}
}
