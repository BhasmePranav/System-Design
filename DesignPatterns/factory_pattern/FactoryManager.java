package LowLevelDesign.design_patterns.factory_pattern;


/*this is the client class for factory design patttern 
here clinet only can share whcih type of objet he. needs and ther control goes to factory class */
public class FactoryManager {

    public static void main(String[] args) {
        
        Vehicle object = null;
        System.out.println("\n\n");
        VehicleFactory manager = new VehicleFactory();
        object = manager.createObject("Bike");
        object.runing();
        object = manager.createObject("Truck");
        object.runing();
        object = manager.createObject("Bus");
        if(object == null)  System.out.println("Not an option");
        System.out.println("\n\n");
        object.runing();

    }

}
