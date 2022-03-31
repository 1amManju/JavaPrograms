package TestYantraJava;

public class SecondMinNoWthoutUsingSorting 
{
	public static void main(String[] args) 
	{
		int[] arr = {10 , 40 , 30 , 20 , 50};
		int FM = Integer.MAX_VALUE;
		int SM = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]<FM)
			{
				SM=FM;
				FM=arr[i];
			}
			else if(arr[i]<SM)
			{
				
				SM=arr[i];
			}
		}
		System.out.println("First min ----> "+FM);
		System.out.println("Second min ----> "+SM);
	}

}