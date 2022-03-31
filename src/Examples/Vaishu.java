package Examples;

public class Vaishu 
{
	static int disp(char a)
	{
		int x=(int) a;
		int y=x-64;
		return y;
	}
	public static void main(String[] args) {
		String s="3PA5Z3X2";
		String a="";
		String n="";
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
