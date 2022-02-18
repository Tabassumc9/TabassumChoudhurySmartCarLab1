package classes;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class Terminal implements SelfCheckCapable {

	private	String CodeLibrary;
	private	String SystemCheck;

	
	public void TestServo() {
		
	}
	
	public void TestCamera() {
		
	}
	
	public void TestMotor() {
		
	}
	
	public void TestBuzzer() {
		
	}
	
	public void TestLED() {
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Terminal";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
	}

}
