package TestYantraJava;

public class PrintStringWithMaxLength 
{
	public static void main(String[] args) 
	{
		String[] s={"Nagaraj" , "Shruti" , "Manjunath" , "Sudha" , "Manju" , "SudhaRani"};
		String maxLength = s[0];
		for (int i = 0; i < s.length; i++) 
		{
			if(s[i].length()>maxLength.length())
			{
				maxLength=s[i];
			}
		}
		for (int i = 0; i < s.length; i++) 
		{
			if(maxLength.length()==s[i].length())
	    	{
				System.out.print(s[i]+"  ");
		    }
			
		}
	}
}
