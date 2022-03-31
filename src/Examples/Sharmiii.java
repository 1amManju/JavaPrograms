package Examples;

public class Sharmiii 
{
	static int disp(char a)
	{
		int x=(int) a;
		int y=x-64;
		return y;
	}
	public static void main(String[] args) {
		String s="2PA3Z9B7";
		String a="";	//Alphabets
		String n="";	//Numbers
		for (int i=0;i<s.length();i++)
		{
			if (Character.isAlphabetic(s.charAt(i)))
			{
				a=a+s.charAt(i);
			}
			else
			{
				n=n+s.charAt(i);
			}
		}
		int sum=0;
		for(int j=0;j<a.length();j++)
		{
			sum=sum+disp(a.charAt(j));
		}
		int x=Integer.parseInt(n);
		while(x!=0)
		{
			int rem=x%10;
			sum=sum+rem;
			x=x/10;
		}
		System.out.println(sum);
	}

}
