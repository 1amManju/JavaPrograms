package Examples;

public class Alphi 
{
	public static void main(String[] args) {
		char ch='a';
		for (int i=3;i>=1;i--)
		{
			for (int j=(3-i);j>=1;j--)
			{
				System.out.print(" ");
				
			}
			for (int l=(i*2)-1;l>=1;l--)
			{
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}

}
