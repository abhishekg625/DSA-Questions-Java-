package arrays;

public class DeleteElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,4,5,6};
		int del= 4;
		for(int i=0; i<arr.length; i++) {
			if(del== i) {
				for(int j=i; j<arr.length-1; j++) {
					arr[j]= arr[j+1];
				}
				break;
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
			
			
		}
		System.out.println();
		System.out.println(arr.length);

	}

}
