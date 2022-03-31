package Patterns;

public class Coke 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=4;i++)
		{
			char ch='D';
			for (int l=1;l<=i;l++)
			{
				System.out.print(ch);
				ch--;
			}
			
			System.out.println();
		}
	}

}
