package TestYantraJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortNumberWithArrayList  
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Value");
		String s = sc.nextLine();
		String[] s1 = s.split(" ");
		sc.close();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for (int i = 0; i < s1.length; i++) 
		{
			int x = Integer.parseInt(s1[i]);
			arr.add(x);
			
		}
		
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println(arr);
	}

}
