package TestYantraJava;

public class PrintStringWithMinLength 
{
	public static void main(String[] args) 
	{
		String[] s={"Nagaraj" , "Shruti" , "Manjunath" , "Sudha" , "Manju" , "SudhaRani"};
		String minLength = s[0];
		for (int i = 0; i < s.length; i++) 
		{
			if(s[i].length()<minLength.length())
			{
				minLength=s[i];
			}
		}
		for (int i = 0; i < s.length; i++) 
		{
			if(minLength.length()==s[i].length())
			{
				System.out.print(s[i]+"  ");
			}
		}
	}
}
