package TestYantraJava;

import java.util.Scanner;

public class LoopingArrayBasedOnKey3 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Key");
		int key = sc.nextInt();
		sc.close();
		int[] a = {2, 4, 1, 5, 6, 9, 3, 0};
		for(int i = 0 ; i < key ; i++)
		{
			int temp = a[0];
			for (int j = 0; j < a.length-1; j++) 
			{
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+"  ");
		}
	}
}
