package Exceptional_Handling;

public class Demolu {
	public static void main(String[] args) {
		System.out.println("***MS***");
		try 
		{
			int i=4/0;
			System.out.println(i);
		}
			
			catch(Exception e)
			{
				System.out.println("caught...");
			}
				
		
		/*catch (ArithmeticException e)
		{
			System.out.println("Handled...");
			
		}*/
		System.out.println("***ME***");
	}

}
