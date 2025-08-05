package DesignPatterns.Singletone;

public class NativeHome {
	
	String city;
	String lane;
	
	//Using object to store created object
	public static NativeHome home = null;

	//defined as private so that not accessible outside class
	//cannnot create direct object outside class
	private  NativeHome(String city, String lane)
	{
		this.city = city;
		this.lane = lane;
	}

	/*using method to create object if object is already created then return that only
	 * else create new one
	 */
	public static NativeHome getHomeAddress(String city, String lane)
	{
		if(home == null)
		{
			return home = new NativeHome(city, lane);
		}
		else return home;
	}


	//Setters for if u need to change details for already defined object then we will update that using setter
	// and then it will new final values
	public void setCity(String city)
	{
		this.city = city;
	}

	public void setLane(String lane)
	{
		this.lane = lane;
	}
}
