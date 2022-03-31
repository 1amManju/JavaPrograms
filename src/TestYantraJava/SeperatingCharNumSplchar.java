package TestYantraJava;

import java.util.Scanner;

public class SeperatingCharNumSplchar 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		String alp ="";
		String splchar ="";
		String num = "";
		for(int i=0 ; i<s.length() ; i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				num=num+s.charAt(i);
			}
			else if(Character.isAlphabetic(s.charAt(i)))
			{
				alp=alp+s.charAt(i);
			}
			else
			{
				splchar=splchar+s.charAt(i);
			}
		}
		System.out.print(alp+"  "+num+"  "+splchar);
	}

}
