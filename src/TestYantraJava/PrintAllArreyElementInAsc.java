package TestYantraJava;

public class PrintAllArreyElementInAsc 
{
	public static void main(String[] args) 
	{
		int[] arr = {10 , 40 , 30 , 20 ,50};
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}
	}
}
