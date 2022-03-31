package Encapsulation;

class House 
{
	private String locker="Gold";

	public String getlocker() 
	{
		return locker;
	}

	public void setlocker(String locker) 
	{
		this.locker=locker;
		
	}
}


public class Thief 
{
	public static void main(String[] args) {
		House h=new House();
		System.out.println(h.getlocker());
		h.setlocker("Rold Gold");
		System.out.println(h.getlocker());
	}
}
