package arrays;
//1,2,3,5,6
//0,1,2,3,4
//we have to find the missing no, sum of available no are 1+2+3+5+6 = 17 and
//the expected sum  are , 1+2+3+4+5+6 =21 , 
// logic we built here is we subtract the expected sum from the available sum and we got the no which was missing.

public class findMissingNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,5,6};
		int exp_elements = arr.length+1;
		int total_sum= exp_elements*(exp_elements+1)/2;
		int sum =0;
		for(int i=0; i<arr.length; i++)
		{
			sum = sum+arr[i];
			
		}
		System.out.println("missing no = " +(total_sum- sum));
		

	}

}
