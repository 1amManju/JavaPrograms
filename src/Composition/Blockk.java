package Composition;

public class Blockk 
{
	static int y;
	int x;
	Blockk()
	{
		System.out.println("Hey Buddy");
	}
	static
	{
		y=20;
		System.out.println(y);
	}
	{
		x=10;
		System.out.println(x);
	}
	public static void main(String[] args) 
	{
		System.out.println("****MS****");
		new Blockk();
		System.out.println("****ME****");
		
	}

}
