package TestYantraJava;

import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		sc.close();
		for(int j=0 ; j<=no ; j++)
		{
			boolean flag = true;
			if(j<=1)
			{
				flag = false;
			}
			for(int i = 2 ; i < j ; i++)
			{
				if(j%i==0)
				{
					flag = false;
					break;
				}
			}
			if(flag)
			{
				System.out.println(j+"--->"+"It is Prime Number");
			}
			//		else
			//		{
			//			System.out.println(j+"--->"+"It is not Prime Number");
			//		}
		}
		String s = "manju";  
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
	}
}
