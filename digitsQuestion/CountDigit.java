package digitsQuestion;
/*count no of digits
 * input : 2 3 1 5 65 7 
 * output: 6
 * */ 

import java.util.*;
public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int count =0;
		while(n!=0) {
			n=n/10;
			count++;
		}
		System.out.println(count);
		sc.close();

	}

}
