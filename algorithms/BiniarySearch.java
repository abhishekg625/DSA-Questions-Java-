package algorithms;
import java.util.*;
public class BiniarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		//int n=arr.length;
		int target=sc.nextInt();
		int l=0;
		int r= arr.length-1;
		
		while(l<=r) {
			int mid= (l+r)/2;
			
			if(arr[mid]== target) {
				System.out.println("item fount at " +mid);
				break;
				
			}else {
				if(arr[mid]<target) {
					l= mid+1;
				}
				else {
					r= mid-1;
				}
				
			}
		
		}
		if(l>r) {
			System.out.println("Not found");
		}
		
		
		sc.close();

	}

}
