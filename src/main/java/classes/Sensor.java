package classes;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class Sensor implements SelfCheckCapable{

		private String DetectObject;
		private String location;
		@Override
		public String getComponentName() {
			// TODO Auto-generated method stub
			return "Sensor";
		}
		@Override
		public boolean selfCheck() {
			// TODO Auto-generated method stub
			return SelfCheckUtils.randomCheck(0.5);
		}
	}

