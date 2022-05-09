package arrays;
//by XOR 
// xor gives 0 on same input and 1 on diffrent inoput
public class missingElementsByXOR {
	static int getmissingNo(int[] arr, int n){
		int xor1 = arr[0];
		int xor2 = 1;
		for(int i =1; i<n; i++)
		
			xor1 = xor1 ^ arr[i];
		
			
		for(int i=2; i<n+1; i++)
		
			xor2 = xor2 ^ i;
			
		
		return(xor1^xor2);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 4, 5, 6};
		int miss = getmissingNo(arr,5);
		System.out.println(miss);
		

	}

}

