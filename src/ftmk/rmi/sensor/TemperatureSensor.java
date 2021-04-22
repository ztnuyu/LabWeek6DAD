package ftmk.rmi.sensor;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * This interface represents temperature sensor
 * @author izzati
 *
 */
public interface TemperatureSensor extends Remote {

	/**
	 * This method return current temperature
	 * 
	 * @return current Temperature
	 * 
	 * @throws RemoteException
	 */

	public int getTemperature() throws RemoteException;
	public int getTemperatureByDay() throws RemoteException;
	public String getTemperatureAverage() throws RemoteException;
}
