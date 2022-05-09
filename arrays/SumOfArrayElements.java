//sum of array elements
package arrays;
import java.util.Scanner;
public class SumOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt()
;
			
		}
		for(int i=0; i<arr.length; i++)
		{
			sum = sum+arr[i];
		
		
		}
		System.out.println(sum);
		
		
		
		
		
		sc.close();
		

	}

}
