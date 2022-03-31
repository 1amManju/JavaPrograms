package TestYantraJava;

import java.util.LinkedHashSet;

public class OrderOfOccaranceOfWord2 
{
	public static void main(String[] args) 
	{
		String str = "Tester";
		String s = str.toLowerCase();
		LinkedHashSet<Character> l = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) 
		{
			l.add(s.charAt(i));
		}
		System.out.println(l);
		for (Character ch : l) 
		{
			for (int i = s.length()-1; i >= 0; i--)
			{
				if(ch==s.charAt(i))
				{
					System.out.print(ch+"="+(i+1)+"  ");
					break;
				}
			}
		}
	}
}
