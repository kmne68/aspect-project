package aspectproject.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import aspectproject.spring.camera.accessories.Lens;

public class App {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aspectproject/spring/aop/beans.xml");

		Camera camera = (Camera) context.getBean("camera");
		Lens lens = (Lens) context.getBean("lens");
		
		try {
			camera.snap();
		}
		catch (Exception e) {
			System.out.println("Caught an exception. " + e.getMessage());
		}
	/*	camera.snap(1000);
		camera.snap("Acropolis");
		camera.snapNighttime();		
		
		lens.zoom(5);		*/
		
		context.close();
	}

}
