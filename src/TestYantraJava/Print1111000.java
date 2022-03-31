package TestYantraJava;

public class Print1111000 
{
	public static void main(String[] args) 
	{
		int[] a = {1, 0, 4, 6, 0, 0, 1, 3};
		int m = 0;
		int l = a.length-1;
		int[] b = new int[l+1];
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]!=0)
			{
				b[m]=a[i];
				m++;
			}
			else
			{
				b[l]=a[i];
				l--;
			}
		}
		for (int i = 0; i < b.length; i++) 
		{
				System.out.print(b[i]+" ");
		}
		
//		for (int i = 0; i < a.length; i++) 
//		{
//			if(a[i]!=0)
//			{
//				System.out.print(a[i]+" ");
//			}
//		}
//		for (int i = 0; i < a.length; i++) 
//		{
//			if(a[i]==0)
//			{
//				System.out.print(a[i]+" ");
//			}
//		}
	}
}
