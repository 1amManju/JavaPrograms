package TestYantraPattern;

public class PrintReverseABCD
{
	public static void main(String[] args) 
	{
	char ch='J';
	for (int i=1;i<=4;i++)
	{
		
		for (int l=4;l>=i;l--)
		{
			System.out.print(ch);
			ch--;
		}
		
		System.out.println();
	}
	}
}
