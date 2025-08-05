package parking_lot;

import java.util.*;

public class ParkingSlots {
	
	static int bikeCounter;
	static int carCounter;
	
	int id;
	boolean isOccupied;
	
	static List<CarParkingSlot> carSlots = new ArrayList();
	static List<BikeParkingSlot> bikeSlots = new ArrayList();
	
	public static void initiallizeSlots(int carCount, int bikeCount)
	{
		for(int i = 0;i<carCount;i++)
		{
			carSlots.add(new CarParkingSlot(carCounter++));
		}
		
		for(int i = 0;i<bikeCount;i++)
		{
			bikeSlots.add(new BikeParkingSlot(bikeCounter++));
		}
	}
	
	public static ParkingSlots getSlot(String vehicleType)
	{
		if(vehicleType.equalsIgnoreCase("Car"))
		{
			for(CarParkingSlot car : carSlots)
			{
				if(car.isOccupied == false)
				{
					car.isOccupied  = true;
					return car;
				}
			}
		}
		else if(vehicleType.equalsIgnoreCase("Bike"))
		{
			for(BikeParkingSlot bike : bikeSlots)
			{
				if(bike.isOccupied ==false)
				{
					bike.isOccupied  = true;
					return bike;
				}
			}
		}
		return null;
	}

}

class CarParkingSlot extends ParkingSlots
{
	
	public CarParkingSlot(int slotId)
	{
		this.id = slotId;
		this.isOccupied = false;
	}
}

class BikeParkingSlot extends ParkingSlots
{
	public BikeParkingSlot(int slotId)
	{
		this.id = slotId;
		this.isOccupied = false;
	}
}
