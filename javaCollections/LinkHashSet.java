package javaCollections;
/*
 * LinkedHashSet maintains a linked list of the entries in the set, in the order in which they
were inserted.
This allows insertion-order iteration over the set. That is, when cycling through
a LinkedHashSet using an iterator, the elements will be returned in the order in which they
were inserted.
 */
 import java.util.*;
public class LinkHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer>lhs = new LinkedHashSet<>();
		lhs.add(1);
		lhs.add(2);
		lhs.add(3);
		lhs.add(4);
		lhs.add(6);
		lhs.add(9);
		
		System.out.println(lhs);
		

	}

}
