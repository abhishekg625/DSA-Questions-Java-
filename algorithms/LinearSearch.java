package algorithms;
import java.util.*;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr= {1,2,3,4,5,6,7};
		int n= arr.length;
		int flag=0;
		int target = sc.nextInt();
		for(int i=0; i<n; i++) {
			
			if(arr[i]==target) {
				
				System.out.println("Item found at= "+i+ "th  position");
				flag=flag+1;
				
			}
			
		}
		if(flag==0) {
			System.out.println("not present");
		}
		sc.close();
	}

}
