package TestYantraJava;

import java.util.LinkedHashSet;

public class RemoveDuplicateFromSentence 
{
	public static void main(String[] args) 
	{
		String s1 = "Hello Buddy Buddy Manju";
		String[] s2 = s1.split(" ");
		LinkedHashSet<String> l = new LinkedHashSet<String>(); 
		for(int i = 0 ; i < s2.length ;i++)
		{
			l.add(s2[i]);
		}
		System.out.println(l);
		for (String string : l) 
		{
			int count = 0;
			for (int i = 0; i < s2.length; i++) 
			{
				if(s2[i].equals(string))
				{
					count++;
				}
			}
	//		System.out.print(string+"="+count+"  ");
			
			//Print non Duplicate
			if(count==1)
			{
				System.out.print(string+"="+count+"  ");
			}
			
			//Print Only Duplicate
//			if(count>1)
//			{
//				System.out.print(string+"="+count+"  ");
//			}
		}
	}

}
