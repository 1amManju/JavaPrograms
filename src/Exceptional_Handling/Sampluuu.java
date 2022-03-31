package Exceptional_Handling;

public class Sampluuu {
	public static void main(String[] args) {
		System.out.println("***MS***");
		try 
		{
			int i=4/2;
			System.out.println(i);
			 
			
				int[] arr={1,2,3};
				System.out.println(arr[7]);
		}
			
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("caught...");
			}
				
		
		catch (ArithmeticException e)
		{
			System.out.println("Handled...");
			
		}
		System.out.println("***ME***");
	}

}
