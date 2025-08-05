package LowLevelDesign.design_patterns.factory_pattern;

/* in this class according to client required type of object factory class will create object and return than object
here notice once thing return type of method is Vehicle it is interface becz all other tpyes of vehivles like
car, bus ,car they implements Vehicle interface so that vehicle can store obkect of any class who implement that iterface */
public class VehicleFactory {

    /* here in teh factory class method we have added the type seelection according to user requirments
    uaing if else pattern */

    public Vehicle createObject(String type)
    {
        if(type.equalsIgnoreCase("Bike"))   return new Bike();
        else if(type.equalsIgnoreCase("Car"))   return new Car();
        else if(type.equalsIgnoreCase("Truck"))   return new Truck();
        return null;
    }

}


/* if we want to extend this type of Vehicle we can directly add it here it willl not cause any changes
in client code */

class Bike implements Vehicle
{

    @Override
    public void runing() {
        System.out.println("Bike is running.");
    }
    
}

class Car implements Vehicle
{

    @Override
    public void runing() {
        System.out.println("Car is running.");
    }
    
}

class Truck implements Vehicle
{

    @Override
    public void runing() {
        System.out.println("Truck is running.");
    }
    
}


