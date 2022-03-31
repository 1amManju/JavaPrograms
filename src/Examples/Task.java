package Examples;
public class Task {
	public static void main(String[] args) {
		int no=5;
		for (int i=5;i>=0;i--)
		{
			for (int l=1;l<=i;l++)
			{
				System.out.print("   @   ");
			}
			no=no-1;
			System.out.println();
			System.out.println();
		}
	}

}
