package stack;
import java.util.*;
import java.io.*;
import java.util.Stack;
public class DuplicateBrackets {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String str= sc.next();
			
			Stack<Character> st= new Stack<>();
			
			for(int i=0; i<str.length(); i++) {
				char ch = str.charAt(i);
				
				
				//if current element is closing bracket
				if(ch== ')') {
					
					if(st.peek()=='(') {
						System.out.println("true");
						return;
					}else {
						while(st.peek()=='(') {
							st.pop();
							
						}
						st.pop();
						
					}
					
				}else {
					st.push(ch);					
				}
				
			}
			System.out.println("false");
			sc.close();
			

	}

}
