package schoolQue;
//Rotate the array as per given no
//input: 1,2,3,4,5,6,7 r= 2
//output: 6,7,1,2,3,4,5

import java.util.*;
public class RotateByNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		int[] arr= new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		//int[] arr= {1,2,3,4,5,6,7,8,9};
		//
		
		int r = sc.nextInt();
		int temp[] = new int[arr.length];
		for(int i= arr.length-1; i>=0; i--) {
			if((i+r)>=arr.length) {
				temp[i+r-arr.length] = arr[i];
				
			}else {
				temp[i+r]= arr[i];
			}
		}
		for(int i=0; i<arr.length;i++) {
			arr[i]= temp[i];
			System.out.print(arr[i]+",");
		}
		
		
		

	}

}
