package javaCollections;
import java.util.*;
public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("My");
		ll.add("Name");
		ll.add("is");
		ll.add("Abhishek");
		ll.addFirst("Hello!");
		ll.addLast("Giri");
		
		System.out.println("Display " +ll);
		
		ll.remove(0);
		ll.removeLast();
		System.out.println("display after removing " +ll);
		

	}

}
