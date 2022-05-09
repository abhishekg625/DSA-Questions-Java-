package sorting;

public class Sort012 {
	public static void sort(int[] arr) {
		int i=0; int j=0; int k=arr.length-1;
		while(i<=k) {
			if(arr[i]==0) {
				swap(arr, i,j);
				i++;
				j++;
			}else 
				if(arr[i]==1) {
					i++;
				}else {
					swap(arr,i,k);
					k--;
					
				}
				
			
			
		}
		
		
	}
	public static void swap(int[] arr ,int i, int j){
		int temp = arr[i];
		arr[i]= arr[j];
		arr[j]=temp;
	}
	public static void print(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,2,2,0,0,1,2,0};
		//int leng= arr.length;
		sort(arr);
		print(arr);
		

	}

}
