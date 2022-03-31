package TestYantraJava;

public class PrimeNumberFromArrayUsingWhile 
{
	public static void main(String[] args) 
	{
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
		for (int i = 0; i < a.length; i++) 
		{
			int no = a[i];
			int x = 2;
			while(x<no)
			{
				if(no%x==0)
				{
					break;
				}
				else
				{
					x++;
				}
			}
			if(x==no)
			{
				System.out.print(no+"  ");
			}
		}
	}

}
