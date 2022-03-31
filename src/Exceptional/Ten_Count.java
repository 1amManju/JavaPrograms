package Exceptional;

class Ten_Count 
{
	public static void main(String[] args) 
	{
		long no=1020301010;
		int count=0;
		while(no!=0)
		{
			long rem=no%100;
			if(rem==10)
			{
				count++;
			}
			no=no/100;
		}
		System.out.println(count);
	}
}