package TestYantraJava;

import java.util.Scanner;

public class HappyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		sc.close();
		System.out.println(sum(sum(sum(no))));
	}
	public static int sum(int no)
	{
		int sum = 0;
		while(no!=0)
		{
			int rem = no%10;
			sum = sum + rem;
			no = no / 10;
		}
		return sum;
		
	}

}
