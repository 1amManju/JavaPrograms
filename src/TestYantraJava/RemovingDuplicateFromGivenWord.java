package TestYantraJava;

import java.util.LinkedHashSet;

public class RemovingDuplicateFromGivenWord 
{
	public static void main(String[] args) {
		String s = "testyantra";
		LinkedHashSet<Character> l = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) 
		{
			l.add(s.charAt(i));
		}
		System.out.println(l);
		for (Character ch : l) 
		{
			int count = 0;
			for (int i = 0; i < s.length(); i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
				
			}
			System.out.print(ch+"="+count+"   ");
		}
	}

}
