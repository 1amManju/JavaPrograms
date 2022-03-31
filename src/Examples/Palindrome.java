package Examples;

public class Palindrome {
	public static void main(String[] args) {
		int no=121;
		int copy=no;
		int rev=0;
		while(no!=0)
		{
			int rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		//System.out.println(rev);
		if(copy==rev)
		{
			System.out.println("Number "+rev+" is Palindrome");
		}
		else
		{
			System.out.println("Number "+rev+" is Palindrome");
		}
	}

}
