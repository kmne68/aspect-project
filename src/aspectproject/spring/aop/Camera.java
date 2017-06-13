package aspectproject.spring.aop;

import org.springframework.stereotype.Component;

@Component ("camera")
public class Camera implements PhotoSnapper, Machine, ICamera {
	
	public Camera() {
		System.out.println("Hello from camera constructor.");
	}
	
	/* (non-Javadoc)
	 * @see aspectproject.spring.aop.ICamera#snap()
	 */
	@Override
	public void snap() throws Exception {
		System.out.println("Snap!");
		
	//	throw new Exception("Cya");
	}
	
	
	/* (non-Javadoc)
	 * @see aspectproject.spring.aop.ICamera#snap(int)
	 */
	@Override
	@Deprecated
	public void snap(int exposure) {
		System.out.println("Snap! Exposure: " + exposure);
	}
	
	
	/* (non-Javadoc)
	 * @see aspectproject.spring.aop.ICamera#snap(java.lang.String)
	 */
	@Override
	public String snap(String name) {
		
		System.out.println("Snap! Name: " + name);
		
		return name;
	}
	
	public void snap(double aperture) {
		System.out.println("Aperture is " + aperture);
	}
	
	
	public void snap(int speed, double aperture) {
		System.out.println("Shutter and aperature are " + speed + " and " + aperture);
	}
	
	
	/* (non-Javadoc)
	 * @see aspectproject.spring.aop.ICamera#snapNighttime()
	 */
	@Override
	public void snapNighttime() {
		
		System.out.println("Snap! Night mode");
	}
}
