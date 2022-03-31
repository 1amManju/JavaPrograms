package Patterns;

public class Vinuta 
{
	public static void main(String[] args) 
	{
		int no=1;
		for (int i=1;i<=4;i++)
		{
			
			for (int l=4;l>=i;l--)
			{
				System.out.print(no);
				no++;
			}
			
			System.out.println();
		}
	}

}
