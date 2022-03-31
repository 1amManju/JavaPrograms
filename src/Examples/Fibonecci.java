package Examples;

public class Fibonecci {
			public static void main(String[] args) {
				int fb1=2;
				int fb2=3;
				int fb3=0;
				for (int i=1;i<=10;i++)
				{
					fb3=fb1+fb2;
					fb1=fb2;
					fb2=fb3;
					System.out.print(fb3+"  ");
				}
				
			}
}
