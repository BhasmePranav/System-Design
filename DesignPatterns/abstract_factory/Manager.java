package LowLevelDesign.design_patterns.abstract_factory;

public class Manager {

        public static void main(String[] args) {

            Company company = new Hyundai();
            Dealer dealer = new Dealer(company);
            dealer.runner();
            
            
        }
}

/* this class is providding which company object should we use accordig to company which is passed by client in main method */
class Dealer
{
    public Car car;
    public Truck truck;

    public Dealer(Company company)
    {
        car = company.myCar();
        truck = company.myTruck();
    }

    public void runner()
    {
        car.myCar();
        truck.myTruck();
    }
    
}
