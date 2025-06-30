package DesignPatterns.Singletone;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member m1 = new Member("Pranav");
		Member m2 = new Member("Mom");

		NativeHome home = NativeHome.getHomeAddress("Pune","Hinjewadi");
		System.out.println("Initial address is : "+home.city+"    "+home.lane);
		m1.showAddress();
		m2.showAddress();


		//updating values of created object
		home.setCity("Mumbai");
		home.setLane("Thane");
		System.out.println("Initial address is : "+home.city+"    "+home.lane);
		m1.showAddress();
		m2.showAddress();

		


	}

}

class Member
{
	String name;


	//Constructor
	public Member(String name)
	{
		this.name = name;
	}


	/*even we are creating home1 second object with another dity details still it will return Pune 
	 * bcz object is already created 
	 */
	public void showAddress()
	{
		NativeHome home = NativeHome.getHomeAddress("Pune", "Hinjewadi");
		System.out.println("address of : "+name+" is : "+home.city+"   "+home.lane);
		
		NativeHome home1 = NativeHome.getHomeAddress("Mumbai", "Thane");
		System.out.println("address of : "+name+" is : "+home1.city+"   "+home1.lane);
	}
}
