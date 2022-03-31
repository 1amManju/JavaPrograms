package TestYantraPattern;

public class PrintPtoD
{
	public static void main(String[] args) 
	{
		
	char ch='P';
	for (int i=4;i>=1;i--)
	{
		
		for (int l=1;l<=i;l++)
		{
			System.out.print(ch);
			ch--;
		}
		
		System.out.println();
		int x=(int) ch;
		x=x-4+i;
		ch=(char) x;
	}
	}

}
