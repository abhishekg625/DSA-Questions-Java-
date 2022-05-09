package arrays;

public class ReverseElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int n= arr.length;
		//actual array
//		for(int i=0; i<n; i++)
//		{
//			System.out.print("Actual array =" +arr[i]);
//			System.out.println();
//		}
		//reverse array
//		for(int j= n-1; j>=0; j--)
//		{
//			System.out.print("Reverse array=" +arr[j]);
//			System.out.println();
//		}
		
//		for(int i=0; i<n/2; i++) {
//			int temp = arr[i];
//			arr[i] = arr[n-1-i];
//			arr[n-1-i] = temp;
//		
//		System.out.println("After reversed " +arr[i]);
//		}
		
		int start=0; 
		int end=n-1;
		while(start<end) {
			int temp= arr[start];
			arr[start]= arr[end];
			arr[end]= temp;
			start++;
			end--;
			
			
		}
		System.out.println(arr);

	}

}
