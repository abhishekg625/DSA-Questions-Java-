//you have given an array elements you have to arrange in a way such that the elements are in their sequence,
// ex- input- 231589-----output-123589

package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class sequenceSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = 5 ; //sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i<size; i++)
		{
			arr[i]= sc.nextInt();
		}
		Arrays.sort(arr);
		for(int j=0; j<size;j++)
		{
			if(arr[j]==arr[j+1]-1)
			{
				System.out.println(arr[j]);
			}
		
		else 
		{
			System.out.println(arr[j]);
		}
		}
		if(arr[size-1]== arr[size-2]+1)
		{
			System.out.println(arr[size-1]);
		}
		else {
			System.out.println(arr[size-1]);
		}
		sc.close();
		

	}
	

}
