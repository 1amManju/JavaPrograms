package Exceptional_Handling;

public class Manju {
	public static void main(String[] args) {
		System.out.println("***MS***");
		try 
		{
			int i=4/0;
			System.out.println(i);
		}
			
		catch (ArithmeticException e)
		{
			System.out.println("Handled...");
			
		}
		finally
		{
			System.out.println("Hey I'm Blocked...");
		}
		System.out.println("***ME***");
	}

}
