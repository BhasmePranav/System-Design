package LowLevelDesign.solidprinciples.isp;

/* ISP : Interface segregation principle, it says that class should not be forced to implement
 * unnecessary methods, any class should implement onnly methods which he is needed.
  */
public class Manager {

    public static void main(String[] args) {
        System.out.println(11);

        Robot robot = new Robot();
        HumanRobot humanRobot = new HumanRobot();
        Machine machine = new Machine();

        robot.work();
        robot.eat();
        humanRobot.eat();
        humanRobot.work();
        machine.work();
    }
}


class Robot implements DoableWork
{
    @Override
    public void work() {
        System.out.println("Robot is Working :");
    }

    /* here robot is force to implment method eat even if he cant eat 
     * this is breaking ISP, robot is forced to implement method , so if we create 2 diff interfaces for these
     * methods then robot is not forced to implement another interface, if he need he can implement multiple interface 
     * as shown below exmaple classs (human robot and human)
    */

    @Override
    public void eat() {
        System.out.println("Robot cant eat : ");
    }
}


/* here human robat can do both work and eat so we are implementing 2 interfaces , but not forced to
 * implement any method which is he is not capable of doing
*/
class HumanRobot implements Eatable, Workable
{

    @Override
    public void work() {
        System.out.println(" Human Robot is Working :");
    }

    @Override
    public void eat() {
       System.out.println(" Human Robot is eating :");
    }
    
}


/* here machine cant eat so we are only implementing its required method. interface */

class Machine implements Workable
{
    @Override
    public void work() {
        System.out.println("Machine is Working : ");
    }
    
}
