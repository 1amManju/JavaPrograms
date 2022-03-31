package Composition;

public class Demo 
{
	Demo()
	{
		System.out.println("Hey Buddy");
	}
	static
	{
		System.out.println("****SIB****");
	}
	{
		System.out.println("****IIB****");
	}
	public static void main(String[] args) 
	{
		System.out.println("****MS****");
		new Demo();
		System.out.println("****ME****");
		
	}


}
