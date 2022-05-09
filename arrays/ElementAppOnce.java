package arrays;
//find the element which appears once in a array and rest twice
//input: 1,1,2,2,3,4,4
//output: 3
import java.util.*;

public class ElementAppOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr= new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int res= arr[0];
		
		for(int i=1; i<arr.length; i++) {
			res = res^arr[i];
			
		}
		System.out.println("Appear once = "+res);
		sc.close();

	}

}
