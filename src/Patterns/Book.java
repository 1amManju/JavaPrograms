package Patterns;

public class Book 
{
	public static void main(String[] args) {
		for (int i=1;i<=4;i++)
		{
			for (int l=1;l<=(5-i);l++)
			{
				System.out.print( i );
			}
			System.out.println();
		}
	}

}
