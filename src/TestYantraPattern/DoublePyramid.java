package TestYantraPattern;

public class DoublePyramid 
{
	public static void main(String[] args) 
	{
		int n = 5;
		for(int i = 0 ; i < n ; i++)
		{
			for(int j =i ; j<n ; j++)
			{
				System.out.print("  ");
			}
			for(int j=(i*2)+1 ; j>=1 ; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = n ; i >= 0 ; i--)
		{
			for(int j =i ; j<n ; j++)
			{
				System.out.print("  ");
			}
			for(int j=(i*2)+1 ; j>=1 ; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
