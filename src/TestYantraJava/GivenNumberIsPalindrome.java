package TestYantraJava;

public class GivenNumberIsPalindrome 
{
	public static void main(String[] args) 
	{
		int no = 1441;
		int act = no;
		int rev = 0;
		while(no!=0)
		{
			int rem = no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println(rev);
		if(rev==act )
		{
			System.out.println("Its Palindrome");
		}
		else
		{
			System.out.println("Its not a Palindrome");
		}
	}

}
