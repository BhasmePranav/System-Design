package LowLevelDesign.design_patterns.abstract_factory;

public interface Truck {

    public void myTruck();
}

class HyundaiTruck implements Truck
{

    @Override
    public void myTruck() {
        System.out.println("This is Hyundai truck.");
    }
    
}


class SuzukiTruck implements Truck
{

    @Override
    public void myTruck() {
       System.out.println("This is SUzuki truck.");
    }
    
}
