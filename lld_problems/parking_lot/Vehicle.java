package parking_lot;

public abstract class Vehicle {
	
	String vehicleNumber;
	String liscene;
	ParkingSlots parkingslot;

	
	public abstract void park(String vehicleNumber, String liscene);
	public abstract void exit(String vehicleNumber, int Id);
	
}

class Car extends Vehicle
{
	ParkingSlots slot = ParkingSlots.getSlot("Car");
	@Override
	public void park(String vehicleNumber, String liscene)
	{
		if(slot != null)
		{
			this.parkingslot = slot;
			System.out.println("YOur car : "+vehicleNumber+"  parked at slot : "+parkingslot.id);
			return;
		}
		else
		{
			System.out.println("No Parking slot available");
			return;
		}
		
	}
	@Override
	public void exit(String vehicleNumber, int Id) {
		
	}
	
}

class Bike extends Vehicle
{
	ParkingSlots slot = ParkingSlots.getSlot("Bike");
	@Override
	public void park(String vehicleNumber, String liscene)
	{
		if(slot != null)
		{
			this.parkingslot = slot;
			System.out.println("Your Bike : "+vehicleNumber+"  parked at slot : "+parkingslot.id);
			return;
		}
		else
		{
			System.out.println("No Parking slot available");
			return;
		}
		
	}

	@Override
	public void exit(String vehicleNumber, int Id) {
		
	}
}




