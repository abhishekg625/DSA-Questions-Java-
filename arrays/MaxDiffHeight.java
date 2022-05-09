//there are  buildings of variable heights you have an k element which you have to add or subtract ,
// in such a way that the height diffrence becomes minimum?

package arrays;
//import java.util.*;
import java.util.Arrays;
public class MaxDiffHeight {
//    int getMinHeigth(int[] arr, int n, int k) {
//        Arrays.sort(arr);
//        int ans = arr[n-1] - arr[0];
//        int smallest = arr[0] + k, largest = arr[n-1]-k;
//        for(int i = 0; i < n-1; i++){
//            int min = Math.min(smallest, arr[i+1]-k);
//            int max = Math.max(largest, arr[i]+k);
//            if(min < 0) 
//                continue;
//            ans = Math.min(ans, max-min);
//        }
//        return ans;
	static int getMaxHeigth(int[] arr, int k, int n)
	{
		if(n==1)
		return 0;
		
		Arrays.sort(arr);
		int ans  = arr[n-1]- arr[0];
		int small = arr[0] +k;
		int big = arr[n-1] -k;
		int temp=0;
		if(small> big)
				{
					temp = small;
					small = big;
					big = temp;
					
				}
		for(int i =0; i<n-1; i++)
		{
			int subtract =arr[i] -k;
			int add = arr[i]+k;
			
			if(subtract >= small || add<= big)
			
				continue;
			
			if(big- subtract <= add- small)
			
				small = subtract ;
				else
			
				big = add;
			
		}
			return Math.min(ans,  big-small);
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,15,10};
		
		int n  = arr.length;
		int k =10;
		System.out.println("max diffrence = " +getMaxHeigth(arr,k,n));

	}

}
