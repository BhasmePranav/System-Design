package parking_lot;

public class VehicleFactory {

	public Vehicle getVehicle(String vehicleType)
	{
		if(vehicleType.equalsIgnoreCase("car"))	return new Car();
		if(vehicleType.equalsIgnoreCase("Bike"))	return new Bike();
		return null;
	}
	
}
