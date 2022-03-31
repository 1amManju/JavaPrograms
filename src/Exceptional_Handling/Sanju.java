package Exceptional_Handling;

public class Sanju {
	public static void main(String[] args) {
		System.out.println("***MS***");
		try 
		{
			int i=4/0;
			System.out.println(i);
		}
		finally
		{
			System.out.println("Hey I'm Blocked...");
		}
		System.out.println("***ME***");
	}

}
