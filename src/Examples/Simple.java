package Examples;

public class Simple 
{
	public static void main(String[] args) {
		char ch='A';
		for (int i=1;i<=4;i++)
		{
			for (int j=(i-1);j>=1;j--)
			{
				System.out.print(" ");
				
			}
			for (int l=(5-i);l>=1;l--)
			{
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}

}
