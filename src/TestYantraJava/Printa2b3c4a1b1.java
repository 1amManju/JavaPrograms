package TestYantraJava;

public class Printa2b3c4a1b1 
{
	public static void main(String[] args) 
	{
		String s = "aabbbccccabbb";
		for (int i = 0; i < s.length(); i++) 
		{
			int count = 0;
			for (int j = i+1 ; j < s.length(); j++) 
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
				else
				{
		   			break;
				}
			}
			i=i+count;
	 		count++;

			System.out.print(s.charAt(i)+"-->"+count+"  ");
		}
	}
}
