package Patterns;

public class Manjunath 
{
	public static void main(String[] args) 
	{
		
		for (int i=1;i<=4;i++)
		{
			char ch='A';
			for (int l=4;l>=i;l--)
			{
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}

}
