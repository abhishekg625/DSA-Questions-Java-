package arrays;
import java.util.Arrays;
public class SquareOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,5,4};
		//int[] arr2 = new int[3];
		Arrays.sort(arr);
		
		
		for(int i=0;i<arr.length;i++)
		{
			
			
		arr[i]= (int)Math.pow(arr[i], 2);
		
		
	
		System.out.println(arr[i]);

}
}
}
