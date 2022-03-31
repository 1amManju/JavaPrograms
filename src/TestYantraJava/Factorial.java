package TestYantraJava;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		sc.close();
		int fact = 1;
		if(no<=0)
		{
			fact = 0;
		}
		for (int i = 1; i <= no ; i++) 
		{
			fact = fact * i ;
		}
		System.out.println(fact);
	}

}
