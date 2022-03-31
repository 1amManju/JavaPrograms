package Examples;
public class Multi_Special 
{
	public static void main(String[] args) 
	{
		String[] arr={"1M3","2W4"};
		String s="";
		String x="";
		int sum=0;
		for (int i=0;i<arr.length;i++)
		{
			s=s+arr[i];
		}
		for(int j=0;j<s.length();j++)
		{
			if(Character.isAlphabetic(s.charAt(j)))
			{
				int y= (int) s.charAt(j);
				sum=sum+add(add(y));
			}
			else
			{
				x=x+s.charAt(j);
			}
		}
		int z=Integer.parseInt(x);
		sum=sum+add(z);
		System.out.println(sum);
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
}
