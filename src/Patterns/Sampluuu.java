package Patterns;

public class Sampluuu 
{
	public static void main(String[] args) 
	{
		
	char ch='A';
	for (int i=1;i<=4;i++)
	{
		for (int j=(4-i);j>=1;j--)
		{
			System.out.print(" ");
			ch++;
		}
		
		for (int l=1;l<=i;l++)
		{
			System.out.print(ch);
			ch++;
		}
		
		System.out.println();
		
	}
	}

}
