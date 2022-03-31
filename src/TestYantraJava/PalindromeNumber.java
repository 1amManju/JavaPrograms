package TestYantraJava;

import java.util.Scanner;

public class PalindromeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		sc.close();
		int num = no;
		int rev = 0;
		while(no!=0)
		{
			int rem = no%10;
			rev = rev*10+rem;
			no = no/10;
		}
		if(num==rev)
		{
			System.out.println(num+"---> It is a Palindrome");
		}
		else
		{
			System.out.println(num+"---> It is not a Palindrome");
		}
	}
}
