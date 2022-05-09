//print sub array between two indexes
package codeCheff;

import java.util.Scanner;

public class Arrsls1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		int[] arr=new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int l= sc.nextInt();
		int r = sc.nextInt();
		
		for(int j=l-1; j<r;j++){
		    System.out.println(arr[j]+ "");
		}
	
		sc.close();

	}

}
