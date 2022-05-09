/* 2 jan Leetcode challange.
 * Que- check all the 'a' appears before 'b' print true if this is so.
 * input: aabb
 * output: true
 * input: ababa
 * output: false
 */

package leetCode;
import java.util.*;
public class CheckAB {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s= sc.next();
		
		System.out.println(checkAB(s));
		sc.close();

	}

	private static boolean checkAB(String s) {
		// TODO Auto-generated method stub
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='b') {
				for(int j=i+1; j<s.length(); j++) {
					if(s.charAt(j)=='a') {
						return false;
					}
				}
			}
			
		}
		return true;
		
	}

}
