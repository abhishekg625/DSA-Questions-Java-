/*merge two sorted arrays
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
   Output: [1,2,2,3,5,6]
   Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
   The result of the merge is [1,2,2,3,5,6] 
   with the underlined elements coming from nums1.

 * */

package arrays;
import java.util.Arrays;
public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
		int m=arr1.length;
		int[] arr2 = {11,12,13,14,15,16,17,18,19,20};
		int n=arr2.length;
		int[] result = new int[m+n];

		//first element from both the arrays
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+""+arr2[i]+" ");
				
				

		
		
		}
		
		
	}

}
