package Javademo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class listdemo {

	public static void main(String[] args) {

		
		List<Integer> li = new ArrayList<Integer>();
		//list can add duplicate
		li.add(12);
		li.add(13);
		li.add(14);
		li.add(15);
		li.add(16);
		li.add(16);
		li.add(16);
		li.add(16);

		
//		for(Integer list1:li)
//		{
//			System.out.println(list1);
//		}
		
		Iterator<Integer> values=li.iterator();
		
		while(values.hasNext())
		{
			System.out.println(values.next());
		}
	}

}
