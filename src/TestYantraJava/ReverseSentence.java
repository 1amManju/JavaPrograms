package TestYantraJava;

import java.util.Scanner;

public class ReverseSentence 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		String[] sh = s.split(" ");
		for (int i = sh.length-1;i>=0 ;i--) 
		{
			System.out.print(sh[i]+" ");
		}
		
	}

}
