package random;

/*
 * input = {4,9,5,3,2,10};
 * output= {0,0,1,3,4,0}
 * 
 */
import java.util.Arrays;
import java.util.Scanner;

public class Cognigent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int []arr=new int[n];
		for (int i=0;i<n;i++){
			arr[i]= sc.nextInt();
		}
		System.out.println(Arrays.toString(getres(arr,n)));


	    }

		private static int[] getres(int[] arr, int n) {
	    	int res[]=new int[n];

	    	res[0]=0;
	    	for (int i=1;i<n;i++){
				int count=0;
	    		for (int j=0;j<i;j++){
	    			if (arr[j]>arr[i]){
	    				count++;
					}
				}
	    		res[i]=count;
			}
	    	return res;

	}

}
