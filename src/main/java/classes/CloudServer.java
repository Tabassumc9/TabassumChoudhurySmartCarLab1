package classes;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class CloudServer implements SelfCheckCapable{

	public CloudServer() {
		int storage;
		int wirelessconnection;
	}
		public void AutomaticDownload() {
			
		}
		
		public void CheckCompatibility() {
			
		}
		@Override
		public String getComponentName() {
			// TODO Auto-generated method stub
			return "CloudServer";
		}
		@Override
		public boolean selfCheck() {
			// TODO Auto-generated method stub
			return SelfCheckUtils.randomCheck(0.5);
		}

}
