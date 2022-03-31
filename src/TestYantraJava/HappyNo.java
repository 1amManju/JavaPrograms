package TestYantraJava;

import java.util.Scanner;

public class HappyNo 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		sc.close();
		while(no>9)
		{
			int sum=0;
			while(no!=0)
			{
				int rem = no%10;
				sum = sum + rem;
				no = no / 10;
			}
			no=sum ;
		}
		System.out.println(no);
	}
}
