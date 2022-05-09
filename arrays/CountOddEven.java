package arrays;

public class CountOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7};
		int n= arr.length;
		int cEven =0; int cOdd=0;
		
		for(int i=0; i<n; i++) {
			if(arr[i]%2==0) {
				cEven++;
				
			}else {
				if(arr[i]%2==1)
				cOdd++;
			}
			
		}
		System.out.println("even " +cEven);
		System.out.println("odd  "+cOdd);
		

	}

}
