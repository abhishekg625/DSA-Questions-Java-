//Balanced Brackets is string have proper brackets or not
package stack;
import java.util.Stack;
import java.util.*;
public class ValidParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str= sc.next();
		Stack<Character> st= new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch =='(' || ch == '{' || ch =='[') {
				st.push(ch);
				
				}else if(ch==')') {
					boolean val=handleClosing(st, '(');
					if(val==false) {
						System.out.println(val);
						return;
					}
					
					
				}else if(ch=='}') {
					boolean val=handleClosing(st, '{');
					if(val==false) {
						System.out.println(val);
						return;
					}
				
			}else if(ch==']') {
				boolean val=handleClosing(st, '[');
				if(val==false) {
					System.out.println(val);
					return;
				}
				
			}
		}
		if(st.size()==0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}
	public static boolean handleClosing(Stack<Character>st, char corresoch) {
		if(st.size()==0) {
			System.out.println("false");
			return false;
			
		}else {
			if(st.peek()!=corresoch) {
				System.out.println("false");
				return false;
				
			}else{
				st.pop();
			}
		}
		return true;
		
	}
	

}
