package LowLevelDesign.design_patterns.abstract_factory;

public interface Company {

    public Car myCar();
    public Truck myTruck();

}

/* returning requested class object*/

class Hyundai implements Company
{

    @Override
    public Car myCar() {
        return new HyundaiCar();
    }

    @Override
    public Truck myTruck() {
        return new HyundaiTruck();
    }

}


class Suzuki implements Company
{

    @Override
    public Car myCar() {
        return new SuzukiCar();
    }

    @Override
    public Truck myTruck() {
        return new SuzukiTruck();
    }

}