package TestYantraJava;

import java.util.Scanner;

public class SumOfNumbersfromString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		String num = "";
		int sum = 0;
		for(int i=0 ; i<s.length() ; i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9' )
			{
				num=num+s.charAt(i);
			}
		}
		int no = Integer.parseInt(num);
		while(no!=0)
		{
			int rem = no%100;
			sum =sum+rem;
			no=no/100;
		}
		System.out.println(sum);
	}

}
