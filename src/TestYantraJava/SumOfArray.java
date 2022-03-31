package TestYantraJava;

public class SumOfArray 
{
	public static void main(String[] args) 
	{
		int[] a = { 1 , 2 , 3, 4, 7, 9, 8, 3};
		int[] b = { 4 , 5 , 6, 7, 8};
		if(a.length<b.length)
		{
			for (int i = 0; i < a.length; i++) 
			{
				System.out.print(a[i]+b[i]+"  ");
			}
			for (int i = a.length; i < b.length; i++) 
			{
					System.out.print(b[i]+"  ");
			}
		}
		else
		{
			for (int i = 0; i < b.length; i++) 
			{
				System.out.print(a[i]+b[i]+"  ");
			}
			for (int i = b.length; i < a.length; i++) 
			{
					System.out.print(a[i]+"  ");
			}
		}

	}

}
