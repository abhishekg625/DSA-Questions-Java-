//reverse of a number
package digitsQuestion;
import java.util.*;
public class RevNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		int reverse=0;
		while(n!=0) {
			
			reverse = reverse*10+n%10;
			n= n/10;
			
		}
		System.out.println(reverse);
		sc.close();

	}

}
