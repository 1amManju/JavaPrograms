package TestYantraJava;

public class SecondMaxNoWthoutUsingSorting 
{
	public static void main(String[] args) 
	{
		int[] arr = {10 , 40 , 30 , 20 ,50 };
		int FL = arr[0];
		int SL = arr[0];
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]>FL)
			{
				SL=FL;
				FL=arr[i];
			}
			else if(arr[i]>SL)
			{
				SL=arr[i];
			}
			
		}
		System.out.println(SL);
	}
}
