package arrays;

public class RemDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,2,3,4,6,6};
		int[] temp = new int [arr.length];
		
		int j=0;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]!= arr[i+1]) {
				temp[j] = arr[i];
				j++;
				
			}
			
		}
		temp[j] = arr[arr.length-1];
		for(int i=0; i<temp.length-2; i++) {
			System.out.print(temp[i]+" ");
		}
	}

}
