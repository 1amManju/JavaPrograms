package TestYantraJava;

public class NumberTriangePyramid 
{
	public static void main(String[] args) 
	{
		int no = 3;
		for (int i = 1; i <= no; i++) 
		{
			for (int j = i; j < no ;j++) 
			{
				System.out.print("  ");
			}
			for(int j = 1; j <= i ;j++) 
			{
				System.out.print(j+" ");
			}
			if(i>1)
			{				
				for(int j=i-1 ; j>=1 ; j--)
				{
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}
}
