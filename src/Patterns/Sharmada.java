package Patterns;

public class Sharmada 
{
	public static void main(String[] args) 
	{
		
		for (int i=1;i<=4;i++)
		{
			char ch='D';
			for (int l=4;l>=i;l--)
			{
				System.out.print(ch);
				ch--;
			}
			System.out.println();
		}
	}


}
