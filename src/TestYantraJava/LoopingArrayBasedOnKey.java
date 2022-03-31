package TestYantraJava;

import java.util.Scanner;

public class LoopingArrayBasedOnKey
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Key");
		int key = sc.nextInt();
		sc.close();
		int[] a = {2, 4, 1, 5, 6, 9, 3, 0};
		for (int i = key; i < a.length; i++) 
		{ 
			System.out.print(a[i]+"  ");
		}
		for (int i = 0; i < key ; i++) 
		{
			System.out.print(a[i]+"  ");
		}
	}
}
