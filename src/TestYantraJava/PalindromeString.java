package TestYantraJava;

import java.util.Scanner;

public class PalindromeString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String rev = "";
		sc.close();
		for(int i = s.length()-1 ; i >= 0 ; i--)
		{
			rev = rev+s.charAt(i);
		}
		if(rev.equals(s))
		{
			System.out.println(s+"--> It is Palindrome");
		}
		else
		{
			System.out.println(s+"--> It is not Palindrome");
		}
	}
}
