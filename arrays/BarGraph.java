package arrays;
import java.util.*;
public class BarGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		int[] arr= new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			
		}
		
		int max= arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max) {
				max= arr[i];
			}
		}
		
		for(int floor=max; floor>=1; floor--) {
			for(int i=0; i<arr.length;i++) {
				if(arr[i]>=floor) {
					System.out.println("#\t");
				}else {
					System.out.println("\t");
				}
				
			}
			System.out.println();
		}

	}

}
