package javaCollections;
import java.util.*;
public class HashSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> hs = new HashSet<Integer>();
	
		for(int i=0; i<10; i=i+2) {
			hs.add(i);
			
		}
		
		System.out.println(hs);
		//======================================
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("A");
		lhs.add("B");
		lhs.add("C");
		lhs.add("D");
		lhs.add("E");
		
		System.out.println("LinkedhashSet " +lhs);
		
		//===============================================
		HashSet<String> hhs = new HashSet<String>();
		hhs.add("A");
		hhs.add("B");
		hhs.add("C");
		hhs.add("D");
		hhs.add("E");
		
		System.out.println("LinkedhashSet " +hhs);
		
		
		
		
		

	}

}
