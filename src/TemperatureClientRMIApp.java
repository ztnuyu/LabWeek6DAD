import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import ftmk.rmi.sensor.TemperatureSensor;

/**
 * This class represent client side of rmi application
 * @author izzati
 *
 */

public class TemperatureClientRMIApp {

	public static void main(String[] args) {
	
		try {
			// Get registry
			Registry rmiRegistry = LocateRegistry.getRegistry();
			
			// Look-up for remote object
			TemperatureSensor remoteSensorJasin = (TemperatureSensor) rmiRegistry.lookup("SensorJasin");
			
			//invoke method from the remote object
			int currentTemperature = remoteSensorJasin.getTemperature();
			
			System.out.println("Current Temperature in Jasin is "+ currentTemperature + " Celcius");
			
		} catch (RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}
