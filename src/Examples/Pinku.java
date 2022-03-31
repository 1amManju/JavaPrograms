package Examples;

public class Pinku 
{
	public static void main(String[] args) {
		int [] arr={17,21,92,86};
		int sum = 0;
		for (int i=0;i<arr.length;i++)
		{
			sum = sum+add(add(arr[i]));
		}
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
