//sum of smallest pair of array

package codeCheff;
import java.util.Arrays;
import java.util.Scanner;
public class SMPAIR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
			
		System.out.print(arr[0]+arr[1]);
		
		
		
		sc.close();
		

	}

}
