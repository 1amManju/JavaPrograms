package TestYantraJava;

public class TwoDimArray 
{
	public static void main(String[] args) 
	{
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		/**
		 * Sum of diagonal
		 */
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				if(i==j)
				{
					sum=sum+a[i][j];
				}
			}
		}
		
		
		/**
		 * Sum of diagonal, another way
		 */
//		for (int i = 0; i < a.length; i++) 
//		{
//			sum = sum + a[i][i];
//		}
		
		/**
		 * Sum of reverse diagonal
		 */
//		int no = a.length-1;
//		for (int i = 0; i < a.length; i++) 
//		{
//			
//			sum = sum + a[i][no];
//			no--;
//		}
		System.out.println(sum);
	}
}
