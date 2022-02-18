package classes;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class ComputerControl implements SelfCheckCapable{
	private	String keyboard;
	private	String mouse;
	
	//computer code to accelerate control of car
	public void AccelerateControl() {
		
	}
	//use computer code to change the light
	public void ChangeLight() {
		
	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Controller";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
	}

}
