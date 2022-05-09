package sorting;

import java.util.Arrays;

//sort first K elements in ascending order than remaining in decending order
// Input= 5,4,6,2,1,3,8,9,-1        K=4
//output= 2,4,5,6,9,8,3,1,-1

public class SortTillK {
	public static void printArray(int[] arr, int n, int k)
	{
		//int len1= k; 
		int  len2 = n-k;
		int[] arr1 = new int[k];
		int[] arr2 = new int[n-k];
		
		for(int i=0; i<k;i++)
			arr1[i] = arr[i];
		
		for(int i=k; i<n; i++)
			arr2[i-k] = arr[i];
		
		Arrays.sort(arr1,0,k);
		Arrays.sort(arr2,k,n-k);
		
		
		for(int i= 0; i<n; i++) {
			if(i<k) 
				arr[i]= arr1[i];
		
		else
		{
			arr[i] = arr2[len2-1];
			len2--;
		}
		}
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,4,6,2,1,3,8,9,-1};
		int k=4;
		int n= arr.length;
		printArray(arr,n,k);

	}

}
