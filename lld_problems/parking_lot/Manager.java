package parking_lot;

public class Manager {

    public static void main(String[] args) {
        
    	ParkingSlots.initiallizeSlots(2, 2);
        VehicleFactory factory = new VehicleFactory();
        Vehicle object = factory.getVehicle("Car");
        object.park("MH03AR0921", "ESZPB");
        

        Vehicle object1 = factory.getVehicle("Car");
        object1.park("MH)$RSvsdsv", "44wrbf");

        Vehicle object2 = factory.getVehicle("Car");
        object2.park("MH)$dfbvrbrw", "44wdvsddsdrbf");
;    }
}
