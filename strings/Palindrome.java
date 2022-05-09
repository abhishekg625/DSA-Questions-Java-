package strings;
//Check a string is palindrome or not
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String reverse= "";
		
		str= str.toLowerCase();
		for(int i=str.length()-1; i>=0; i--) {
			reverse = reverse+str.charAt(i);
		}
		//check content of inside string
		
		if(str.contentEquals(reverse)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not");
		}
		sc.close();
		

	}

}
