package aspectproject.spring.aop;

public interface ICamera {

	void snap() throws Exception;

	void snap(int exposure);

	String snap(String name);

	void snapNighttime();
	
	void snap(double exposure);
	
	public abstract void snap(int i, double d);

}