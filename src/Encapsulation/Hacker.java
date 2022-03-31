package Encapsulation;

class Bank
{
	private String secure="details";

	public String getsecure() {
		return secure;
	}

	public void setsecure(String secure) 
	{
		this.secure=secure;
	}
}


public class Hacker {
	public static void main(String[] args) {
		Bank b=new Bank();
		System.out.println(b.getsecure());
		b.setsecure("Hacked");
		System.out.println(b.getsecure());		
		
	}
}
