//Arrays class in Collection ans its methods

package javaCollections;
import java.util.*;
public class ArraysClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
		int[] arr2=  {4,3,6,2,9,1,7,8,10,5};
		
		int result1= Arrays.binarySearch(arr1, 9);
		System.out.println("Arrays Binary search = "+result1);
		
		
		int[] result2= Arrays.copyOf(arr2, result1);
		System.out.println(Arrays.toString(result2));
		
		int[] range = Arrays.copyOfRange(arr1, 0, 3);
		System.out.println(Arrays.toString(range));
		
		System.out.println("+++++++++++++++++++++++++++++");
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] array = new int[n];
		
		for(int i=0; i<n; i++) {
			array[i]=sc.nextInt();
		}
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		 Arrays.sort(array, 3, 6);
		
		System.out.println("Sorted by range= " +Arrays.toString(array));
		
		
		sc.close();

	}

}
