package TestYantraJava;

public class FirstMinNoWthoutUsingSorting 
{
	public static void main(String[] args) 
	{
		int[] arr = {10 , 40 , 30 , 20 ,50};
		int FM = arr[0];
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]<FM)
			{
				FM=arr[i];
			}
			
		}
		System.out.println(FM);
	}

}
