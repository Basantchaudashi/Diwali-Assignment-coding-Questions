//Write a Java program to reverse elements in a array list.

import java.util.*;
public class Q5
{
	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("orange");
		list.add("black");
		list.add("pink");
		list.add("red");
		list.add("blue");
		System.out.println("List before reversing:"+list);
		Collections.reverse(list);
		System.out.println("List after reversing:"+list);
	}
}
