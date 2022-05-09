package arrays;
//Find Maximum and Minimum element in array

//import java.util.Arrays;
public class MaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,5,6,9,8,7,10,1,2};
		int min = arr[0];
		int max= arr[0];
//		Arrays.sort(arr);
//		for(int i=0; i<arr.length; i++) {
//			System.out.println("smallest = " +arr[0]+ " largest  "+arr[arr.length-1]);
//			break;
//			}
		
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>max) {
				max= arr[i];
			}
			System.out.println(max);
			
		}
		for(int i=0; i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			System.out.println(min);
		}
		
		
	}

}
