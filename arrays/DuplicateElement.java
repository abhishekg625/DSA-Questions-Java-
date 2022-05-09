package arrays;
//find Duplicate elements and remove them
import java.util.*;
public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,2,3,4,4,5};
		//int n = arr.length;
//		for(int i=0; i<n;i++)
//		{
//			for(int j=i+1; j<n; j++)
//			{
//				if(arr[i]== arr[j])
//				{
//					System.out.println("Duplicate element =" +arr[i]);
//				}
//			}
//		}
		
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0; i<arr.length; i++) {
			hs.add(arr[i]);
		}
		
		//for every no in hs 
		for(int no: hs) {
			System.out.print(no+ " ");
			
		}
		

	}

}
