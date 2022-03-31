package Patterns;

public class Twist 
{
	static char word(int no)
	{
		char ch = (char) no;
		return ch;
	}
	static int add(int no)
	{
		int sum=0;
		while (no!=0)
		{
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		return sum;
	}
	static void twist(int no)
	{
		int x=no%100;
		char s=word(x);
		int y=no/100;
		int z=y;
		int sum=0;
		while (z!=0)
		{
			int rem=z%100;
			sum=sum+add(add(rem));
			z=z/100;
		}
		sum=add(add(sum));
		System.out.println(sum+""+s);
	}
	public static void main(String[] args)
	{
		twist(366468);
	}

}
