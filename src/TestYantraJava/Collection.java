package TestYantraJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Collection 
{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
	
		System.out.println("Tree Set");
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Hello");
		ts.add("Hey");
		ts.add("Buddy");
		try {
			ts.add(null);
		} catch (Exception e) {
			
		}
		ts.add("Manju");
		
		System.out.println(ts);
		System.out.println(ts.descendingSet());
		
		System.out.println("Array List");
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(20);
		al.add(10);
		al.add(05);
		al.add(45);
		al.add(235);
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		
		System.out.println("Linked Hash Set");
		LinkedHashSet lhs = new LinkedHashSet<>();
		lhs.add(20);
		lhs.add(10);
		lhs.add(05);
		lhs.add(45);
		lhs.add(235);
		lhs.add(10);
		lhs.add(05);
		lhs.add(45);
		lhs.add(235);
		System.out.println(lhs);
		
		System.out.println("Array List");
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("Manju");
		al1.add("Sudha");
		al1.add("Nagaraj");
		al1.add("Shruti");
		//al1.add(null);         Collection Will not Sort If there is a null value
		
		System.out.println(al1);
		Collections.sort(al1);
		System.out.println(al1);
		Collections.reverse(al1);
		System.out.println(al1);
		
	}
}
