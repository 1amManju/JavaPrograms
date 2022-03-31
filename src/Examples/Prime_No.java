package Examples;

public class Prime_No 
{
	static boolean prime(int no)
	{
		boolean flag=true;
		if(no==1)
		{
			flag=false;
		}
		for(int i=2;i<no;i++)
		{
			if(no%2==0)
			{
				flag=false;
			}
		}
		return flag;
	}
	public static void main(String[] args) 
	{
		int no=123456;
		int count=0;
		while (no!=0)
		{
			int rem=no%10;
			if(prime(rem))
			{
				count++;
			}
			no=no/10;
		}
		System.out.println(count);
	}
}
