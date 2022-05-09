package strings;
//Count Characters of string
import java.util.*;
public class CountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		int count =1;
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println(count);
		sc.close();

	}

}
