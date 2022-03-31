package TestYantraJava;

public class PrimeNumberFromArray 
{
	public static void main(String[] args) 
	{
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
		for (int i = 0; i < a.length; i++) 
		{
			boolean flag = true;
			if(a[i]<=1)
			{
				flag = false;
			}
			
			for(int j = 2 ; j < a[i] ; j++)
			{
				if(a[i]%j==0)
				{
					flag = false;
				}
			}
			if(flag==true)
			{
				System.out.print(a[i]+"  ");
			}
		}
	}

}
