package TestYantraJava;

public class RemovingDuplicateFromGivenWord2 
{
	public static void main(String[] args) 
	{
		String s = "manjunath";
		for (int i = 0; i < s.length(); i++)
		{
			int count = 0;
			for (int j = 0; j < s.length(); j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}

			}
			//System.out.print(s.charAt(i)+"="+count+"   ");
			if(count>1)
			{

				System.out.print(s.charAt(i)+"="+count+" ");
			}
		}
	}


}
