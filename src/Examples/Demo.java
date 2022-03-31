package Examples;

public class Demo 
{
	public static void main(String[] args) 
	{	
		for (int h=2;h>=1;h-- )
		{
			
			for (int g=2;g>=h;g--)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		for (int i=3;i>=1;i--)
		{
			for (int l=1;l<=i;l++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	
	}

}
