package classes;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class App_Control implements SelfCheckCapable{
	private String app_Download;
	private String color;
	
	//use app to AccelerateControl of the car
	public void AccelerateControl() {
		
	}
	
	//use app to Change the Lights on the car
	public void ChangeLightColor() {
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "App";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);;
	}
}