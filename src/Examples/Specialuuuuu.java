package Examples;

public class Specialuuuuu 
{
	public static void main(String[] args) 
	{
		String[] arr={"123","234"};
		String s="";
		int sum=0;
		for (int i=0;i<arr.length;i++)
		{
			s=s+arr[i];
		}
		int x=Integer.parseInt(s);
		while(x!=0)
		{
			int rem=x%10;
			sum=sum+rem;
			x=x/10;
		}
		System.out.println(sum);
	}

}
