package TestYantraJava;

public class SumOfFirst3MaxNumbers 
{
	public static void main(String[] args) 
	{
		int[] arr = {10 , 40 , 30 , 20 ,50};
		int temp = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < 3; i++) 
		{
			sum=sum+arr[i];			
		}
		System.out.println(sum);
	}

}
