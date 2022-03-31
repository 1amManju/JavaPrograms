package TestYantraJava;

public class ReverseStringWithoutLengthmtd 
{
	public static void main(String[] args) 
	{
		String s = "Manju";
		char[] str = s.toCharArray();
		int count = 0;
		for (@SuppressWarnings("unused") char c : str) 
		{
			
			count++;
		}
		for(int i=count-1 ; i>=0 ; i--)
		{
			System.out.print(s.charAt(i));
		}
		
	}

}
