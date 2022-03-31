package TestYantraJava;

import java.util.Scanner;

public class ReverseEachWord 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		String[] sh = s.split(" ");
		for (int i = 0 ; i < sh.length; i++) 
		{
			if(i%2==1)
			{
				System.out.print(reverse(sh[i])+" ");
			}
			else
			{
				System.out.print(sh[i]+" "); 
			}
			
		}
		
	}
	public static String reverse(String s)
	{
		String rev="";
		for (int i = s.length()-1 ; i>=0 ; i--) 
		{
			rev=rev+s.charAt(i);
		}
		return rev;
	}

}
