/**
 * 
 */
package classes;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

/**
 * @author tabassum
 *
 */
public class WifiAdaptor implements SelfCheckCapable {
	private String wirelessConnection;
	
public void ConnectWifi() {
		
	}

@Override
public String getComponentName() {
	// TODO Auto-generated method stub
	return "Wifi";
}

@Override
public boolean selfCheck() {
	// TODO Auto-generated method stub
	return SelfCheckUtils.randomCheck(0.5);
}

}
