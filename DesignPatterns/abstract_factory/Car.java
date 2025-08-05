package LowLevelDesign.design_patterns.abstract_factory;


/* Car interface is implemented by diff car brands */
public interface Car {

    public void myCar();

}


class HyundaiCar implements Car
{

    @Override
    public void myCar() {
        System.out.println("This is Hyundai Car.");
    }
    
}

class SuzukiCar implements Car
{

    @Override
    public void myCar() {
        System.out.println("This is Suzuki Car.");
    }
    
}
