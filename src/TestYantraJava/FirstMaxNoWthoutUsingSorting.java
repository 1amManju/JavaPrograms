package TestYantraJava;

public class FirstMaxNoWthoutUsingSorting 
{
	public static void main(String[] args) 
	{
		int[] arr = {10 , 40 , 30 , 20 ,50};
		int FL = arr[0];
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]>FL)
			{
				FL=arr[i];
			}
			
		}
		System.out.println(FL);
	}
}
