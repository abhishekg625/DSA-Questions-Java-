package javaCollections;
import java.util.*;
public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("starting size " +al.size());
		
		al.add("A");
		al.add("E");
		al.add("I");
		al.add("O");
		al.add("U");
		al.add(2,"A1");
		
		
		System.out.println(al.contains("A"));  
		
		System.out.println("size after inserting " +al.size());
		System.out.println("Items " +al);
		
		al.remove("A");
		al.remove(0);
		
		System.out.println("size after removing  "+al);
		
		
		//randonmly suffle elements
		Collections.shuffle(al);
		System.out.println(al);

	}

}
