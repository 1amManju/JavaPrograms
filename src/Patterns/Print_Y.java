package Patterns;

public class Print_Y 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for (int l=1;l<=5;l++)
			{
				if (((i==1) && (l==1 || l==5)) || ((i==2) && (l==2 || l==4)) || ((i>=3) && (l==3)))
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
