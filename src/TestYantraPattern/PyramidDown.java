package TestYantraPattern;

public class PyramidDown 
{
	public static void main(String[] args) 
	{
		int n = 5;
		for(int i = n ; i >= 0 ; i--)
		{
			for(int j =i ; j<n ; j++)
			{
				System.out.print("  ");
			}
			for(int j=(i*2)-1 ; j>=1 ; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
