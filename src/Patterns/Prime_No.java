package Patterns;

public class Prime_No 
{
	public static void main(String[] args) {
		
		
		for(int l=2;l<=100;l++)
		{
			int no=l;
			int y=4;
		for (int i=2;i<no;i++)
		{
			if(l%i==0)
			{
			y=5;
			
			}
			
		}
		if(y==4)
		{
			System.out.print(" "+l+" ");
		}
		
		}
	}

}
