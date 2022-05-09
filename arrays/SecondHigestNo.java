package arrays;
//find second highest number from array
import java.util.*;
public class SecondHigestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {22,56,123,90,1,2,3,4,5};
		
//----------------------------------------------------------------------------------------
		// first method
//----------------------------------------------------------------------------------------

//		Arrays.sort(arr);
		
//		System.out.println("second highest= "+arr[arr.length-2]);
//--------------------------------------------------------------------------------------
		// second method
//------------------------------------------------------------------------------
		
//		int highest = Integer.MIN_VALUE;
//		int secHighest = Integer.MIN_VALUE;
//		
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]>highest) {
//				secHighest= highest;
//				highest= arr[i];
//			}else {
//				if(arr[i]>secHighest && arr[i]!= highest) {
//					secHighest= arr[i];
//				}
//				
//			}
//			
//		}
//		if(secHighest== Integer.MIN_VALUE) {
//			System.out.println("no secount highest number");
//		}else {
//			System.out.println("Second Highest = "+secHighest);
//		}
		
		
//---------------------------------------------------------------------------------------------------
		// third method
//---------------------------------------------------------------------------------------------------
		
		
		for(int i=0; i<arr.length; i++) {
			int flag=0;
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp= arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
					
				}
				flag=1;
			}
			if(flag==0) {
				break;
			}
			
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		System.out.print(arr[arr.length-2]);
		

	}
}
