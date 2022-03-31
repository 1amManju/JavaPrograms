package TestYantraJava;

import java.util.Scanner;

public class FibonacciSeriesUntilGivenValue 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		sc.close();
		int fb1=0;
		int fb2=1;
		int fb3=0;
		System.out.print(fb1+"  "+fb2+"  ");
		for(int i = 1 ; i < no ; i++)
		{
			fb3=fb1+fb2;
			fb1=fb2;
			fb2=fb3;
			if(fb3>no)
			{
				break;
			}
			else
			{
				System.out.print(fb3+"  ");
			}
		}	
	}

}
