package TestYantraPattern;

public class Print1to16
{
	
	public static void main(String[] args) 
	{
		int no=1;
		for (int i=1;i<=4;i++)
		{
			
			for (int l=1;l<=i;l++)
			{
				System.out.print(no+"  ");
				no++;
			}
			
			System.out.println();
			no=no+4-i;
		}
	}

}
