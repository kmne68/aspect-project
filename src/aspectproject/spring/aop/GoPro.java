package aspectproject.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class GoPro {

	public void capture() {
		System.out.println("GoPro capturing awesomeness");
	}
}
