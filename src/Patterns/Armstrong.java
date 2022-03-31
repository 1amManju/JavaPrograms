package Patterns;

public class Armstrong 
{
	public static void main(String[] args) {
		int no=123;
		int sum=0;
		int copy=no;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+(rem*rem*rem);
			no=no/10;
		}
		if (copy==sum)
		{
			System.out.println("it is a Armstrong no ");
		}
		else {
			System.out.println("it is not a Armstrong no "); 
		}
	}

}
