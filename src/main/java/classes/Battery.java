package classes;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class Battery implements SelfCheckCapable{
	 private int Power;
	private int Voltage;
	
	//Battery recharges to power SmartCar
	public void ReCharge() {
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Battery";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
	}

}
