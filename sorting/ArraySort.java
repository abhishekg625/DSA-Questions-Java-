package sorting;
import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {55,1,3,34,11,99,9,90,100,123,45};
		
		//Arrays.fill(arr, 40);
		Arrays.sort(arr);
		int index =Arrays.binarySearch(arr, 9);
		//for(int i:arr)
			
		
			System.out.println(index);
		
		
		

	}

}
