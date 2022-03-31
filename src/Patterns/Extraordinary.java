package Patterns;

public class Extraordinary 
{
	static int add(int no)
	{
		int x=0;
		while(no!=0)
		{
			int rem=no%10;
			x=x+rem;
			no=no/10;
			
		}
		return x;
	}
	static int fact(int no)
	{
		int fact=1;
		for(int i=no;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) 
	{
		int no=125432;
		int sum=0;
		while(no!=0)
		{
			int rem=no%100;
			int y=add(rem);
			sum=sum+fact(y);
			no=no/100;
		}
		System.out.println(sum);
	}

}
