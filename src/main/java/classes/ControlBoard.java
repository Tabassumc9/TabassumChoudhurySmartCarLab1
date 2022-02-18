package classes;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class ControlBoard implements SelfCheckCapable{

		private String location;
		private String coating;
		private String shape;
	
	//control board receives and sends signal to the other features for motion
	public void ReceiveSignal() {
		
	}
	
	public void SendSignal() {
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Board";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
	}

}
