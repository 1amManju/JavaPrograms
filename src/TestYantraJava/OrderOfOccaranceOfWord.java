package TestYantraJava;

import java.util.LinkedHashSet;

public class OrderOfOccaranceOfWord 
{
	public static void main(String[] args) {
		String s = "manjunath";
		LinkedHashSet<Character> l = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) 
		{
			l.add(s.charAt(i));
		}
		System.out.println(l);
		for (Character ch : l) 
		{
			for (int i = 0; i < s.length(); i++)
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
