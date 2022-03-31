package TestYantraJava;

import java.util.LinkedHashSet;

public class RemoveVowels 
{
	public static void main(String[] args) 
	{
		String s = "TestYantra";
		String s1 = s.toLowerCase();
		char[] s2 = s1.toCharArray();
		for (int i = 0; i < s2.length; i++) 
		{
			if(s2[i]=='a' ||s2[i]=='e' ||s2[i]=='o' ||s2[i]=='i' ||s2[i]=='u' );
			else
			{
				System.out.print(s2[i]);
			}
		}
		System.out.println(); 
		LinkedHashSet<Character> l = new LinkedHashSet<>();
		for (int i = 0; i < s2.length; i++) 
		{
			l.add(s2[i]);
		}
		for (Character ch : l)
		{
			int count = 0;
			if(ch=='a' ||ch=='e' ||ch=='o' ||ch=='i' ||ch=='u' )
			{
				for (int j = 0; j < s2.length; j++)
				{
					if(ch==s2[j])
					{					
						count++;
					}
				}
				System.out.print(ch+"="+count+"  ");
			}
		}
	}
}
