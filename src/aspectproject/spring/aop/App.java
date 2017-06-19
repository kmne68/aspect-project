package aspectproject.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// import aspectproject.spring.camera.accessories.Lens;

public class App {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aspectproject/spring/aop/beans.xml");

		IBlender blender = (IBlender)context.getBean("blender");
		blender.blend();
		
		IFan fan = (IFan)context.getBean("fan");
		fan.activate(5);
		
		
		
		Object object = context.getBean("camera");
		System.out.println("Class of camera bean: " + object.getClass());
		System.out.println(object instanceof Camera);
				
		ICamera camera = (ICamera) context.getBean("camera");
//		Lens lens = (Lens) context.getBean("lens");
		

//		camera.snap(500);
//		camera.snapNighttime();
		
		try {
			camera.snap();
		}
		catch (Exception e) {
			System.out.println("Caught an exception. " + e.getMessage());
		}
		

		camera.snap(500);
		camera.snapNighttime();
		camera.snap(1.8);
		camera.snap(500, 1.8);
		
		
/*		camera.snap(1000);
		camera.snap("Acropolis");
		camera.snapNighttime();		
*/		
	//	lens.zoom(5);	
		
		GoPro goPro = (GoPro)context.getBean("goPro");
		goPro.capture();
		
		context.close();

	}


}
