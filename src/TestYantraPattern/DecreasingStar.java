package TestYantraPattern;

public class DecreasingStar 
{
	public static void main(String[] args) 
	{
		for (int i=5;i>=1;i--)
		{
			for (int l=1;l<=i;l++)
			{
				System.out.print(" *  ");
			}
			System.out.println();
		}
	}

}
