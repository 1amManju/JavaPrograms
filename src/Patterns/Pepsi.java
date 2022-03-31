package Patterns;

public class Pepsi 
{
	public static void main(String[] args) 
	{
		char ch='D';
		for (int i=1;i<=4;i++)
		{
			for (int l=1;l<=i;l++)
			{
				System.out.print(ch);
			}
			ch--;
			System.out.println();
		}
	}

}
