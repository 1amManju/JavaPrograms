package Examples;

public class Sorting 
{
	public static void main(String[] args) 
	{
		int arr[]={30,22,25,15,3};
		for (int i=0;i<arr.length;i++)
		{
			for (int j=1;j<arr.length;j++)
			{
				if(arr[j-1]>arr[j])
				{
					int x=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=x;
				}
			}
		}
		for(int l=0;l<arr.length;l++)
		{
			System.out.print(arr[l]+" ");
		}
		
	}

}
