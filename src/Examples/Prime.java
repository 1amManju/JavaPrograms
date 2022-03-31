package Examples;

public class Prime {
	public static void main(String[] args) {
		for(int i=2;i<=100;i++)
		{
			//int no=i;
			boolean x=true;
			for (int l=2;l<i;l++)
			{
				if (i%l==0)
				{
					x=false;
					break;
				}
			}
			if(x==true)
			{
				System.out.println(i);
			}
		}
	}
}
