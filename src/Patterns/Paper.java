package Patterns;

public class Paper 
{
	public static void main(String[] args) {
		for (int i=1;i<=4;i++)
		{
			for (int l=4;l>=i;l--)
			{
				System.out.print( l );
			}
			System.out.println();
		}
	}

}
