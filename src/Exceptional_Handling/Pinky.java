package Exceptional_Handling;

public class Pinky 
{
	public static void main(String[] args) {
		System.out.println("***MS***");
		try 
		{
			int a=8;
			int b=2;
			int i=a/b;
			try 
			{
				int[] arr={1,2,3};
				
				System.out.println(arr[i]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("caught...");
			}
				
		}
		catch (ArithmeticException e)
		{
			System.out.println("Handled...");
			
		}
		System.out.println("***ME***");
	}

}
