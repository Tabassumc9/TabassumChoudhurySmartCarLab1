package classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fiu.jit.GenericComponent;
import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class FreeNoveSmartCar implements GenericComponent{

			private String color;
			private String brand;
			private String model;
			private String price;
			private String operatingSystem;
			private FreeNoveSmartCar mySmartCar;
			private App_Control myApp;
			private Battery myBattery;
			private Buzzer myBuzzer;
			private Camera myCamera;
			private CloudServer myCloudServer;
			private ComputerControl myComputerControl;
			private ControlBoard myBoard;
			private Sensor mySensor;
			private Light myLight;
			private Motor myMotor;
			private PhotoResistor myPhoto;
			private Terminal myTerminal;
			private UltrasonicModule myUltrasonic;
			private Wheels myWheels;
			private WifiAdaptor myWifi;
			
			public FreeNoveSmartCar() {
				mySmartCar = new FreeNoveSmartCar(); 
				myApp = new App_Control();
				myBattery = new Battery();
				myBuzzer = new Buzzer();
				myCamera = new Camera();
				myCloudServer = new CloudServer();
				myComputerControl = new ComputerControl();
				myBoard = new ControlBoard();
				mySensor = new InfraredSensor();
				myLight = new Light();
				myMotor = new Motor();
				myPhoto = new PhotoResistor();
				mySensor = new Sensor();
				myTerminal = new Terminal();
				myUltrasonic = new UltrasonicModule();
				myWheels = new Wheels();
				myWifi = new WifiAdaptor();		
				
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "FreeNove Smart Car";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
	}

	@Override
	public List<SelfCheckCapable> getSubComponents() {
		List internalComponents = new ArrayList(); // create an empty list
		Collections.addAll(internalComponents, mySmartCar, myApp, myBattery, myBuzzer, myCamera, 
		myCloudServer, myComputerControl, myBoard, mySensor, myLight, myMotor, myPhoto, mySensor, myTerminal,
		myUltrasonic, myWheels, myWifi);
		return internalComponents;
	};
	}

