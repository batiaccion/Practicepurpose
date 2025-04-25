package Javademo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setdemo {

	public static void main(String[] args) {


		Set<String> set1 = new HashSet<String>();

		set1.add("Test1");
		set1.add("Test5");
		set1.add("Test2");
		set1.add("Test3");
		set1.add("Test4");

		//Printing hashset elements
		Iterator<String> values =set1.iterator();

		while(values.hasNext())
		{
			System.out.println(values.next());	
		}
		
		//		for(String s:set1)
		//		{
		//		System.out.println(s);
		//		}
		//		
	}

}
