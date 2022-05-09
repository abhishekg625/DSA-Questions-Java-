package javaCollections;
import java.util.*;
public class Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> fruits = new Stack<String>();
		fruits.push("aam");
		fruits.push("seb");
		fruits.push("kela");
		fruits.push("amrud");
		
		
		System.out.println("Display " +fruits);
		System.out.println("Display frst item " +fruits.peek());
		
		fruits.pop();
		
		System.out.println("after poping out " +fruits);
		

	}

}
