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
			TemperatureSensor remoteSensorAyerKeroh = (TemperatureSensor) rmiRegistry.lookup("SensorAyerKeroh");
			
			//invoke method from the remote object
			int currentTemperature = remoteSensorJasin.getTemperature();
			int currentTemperature2 = remoteSensorAyerKeroh.getTemperature();
			int currentTemperature3 = remoteSensorAyerKeroh.getTemperatureByDay();
			String currentTemperature4 = remoteSensorAyerKeroh.getTemperatureAverage();
			
			System.out.println("Current Temperature in Jasin is "+ currentTemperature + " Celcius");
			System.out.println("Current temperature in Ayer Keroh is " + currentTemperature2 + " Celcius");
			System.out.println("Current temperature in Ayer Keroh on Monday is " + currentTemperature3 + " Celcius");
			System.out.println("Average temperature in Ayer Keroh is " + currentTemperature4 + " Celcius");
			
		} catch (RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}
