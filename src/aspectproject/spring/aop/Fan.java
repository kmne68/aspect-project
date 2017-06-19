package aspectproject.spring.aop;

public class Fan implements IFan {

	/* (non-Javadoc)
	 * @see aspectproject.spring.aop.IFan#activate(int)
	 */
	@Override
	public void activate(int i) {
		System.out.println("Fan speed is " + i);
		
	}

}
