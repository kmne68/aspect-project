package aspectproject.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Camera {
	
	int photoCount = 0;

	public void snap() {
		System.out.println("Snap!");
	}
	
	
	public void snap(int exposure) {
		System.out.println("Snap! Exposure: " + exposure);
	}
	
	
	public String snap(String name) {
		photoCount++;
		System.out.println("Snap! Name: " + name + ", " + photoCount);
		
		return name + photoCount;
	}
	
	
	public void snapNighttime() {
		
		System.out.println("Snap! Night mode");
	}
}
