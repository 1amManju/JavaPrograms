package Exceptional_Handling;

public class Shranky 
{
	public static void main(String[] args) {
		System.out.println("***MS***");
		try 
		{
			int i=1/0;
			System.out.println(i);
		
		}
		catch (ArithmeticException e)
		{
			System.out.println("Handled...");
			
		}
		System.out.println("***ME***");
	}

}
