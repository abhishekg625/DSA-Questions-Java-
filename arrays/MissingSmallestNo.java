// only correct for 1 test case
//find lowest missing number
package arrays;
import java.util.Arrays;
//import java.util.Scanner;
public class MissingSmallestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		        Scanner sc = new Scanner(System.in);
//		        int t = sc.nextInt();
//		        int arr[]=new int[t];
//		        for (int i=0;i<t;i++){
//		            arr[i]= sc.nextInt();
		int[] arr = {-1,0,1,2,3,5};
		int n= arr.length;
		       // }
		        Arrays.sort(arr);

		        for (int j=1;j<Integer.MAX_VALUE;j++){
		           // System.out.println(j);
		            boolean cheak=false;
		            for (int k=0;k<n;k++){
		                if (j==arr[k]){
		                    cheak=true;
		                    break;
		                }
		            }
		            if (cheak==false){
		                System.out.println(j);
		                break;

		            }


		        }


		    }


		}
	 


