package TestYantraJava;

import java.util.Scanner;

public class FibonacciSeriesRange
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		sc.close();
		int fb1=0;
		int fb2=1;
		System.out.print(fb1+"  "+fb2+"  ");
		int fb3=0;
		for(int i = 1 ; i <= no ; i++)
		{
			fb3=fb1+fb2;
			fb1=fb2;
			fb2=fb3;
			System.out.print(fb3+"  ");
		}	
	}
}
