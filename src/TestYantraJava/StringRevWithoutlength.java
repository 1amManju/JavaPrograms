package TestYantraJava;

public class StringRevWithoutlength 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		String s = "Manju";
		String rev = "";
		char[] str = s.toCharArray();
		int count = 0;
		for (char c : str) 
		{
	 		count++;
		}
		for(int i=count-1 ; i>=0 ; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
