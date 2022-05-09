package sorting;

 class MergeSort {
	 void merge(int[] arr, int beg,int end) {
		 if(beg<end) {
		 int mid = (beg+end)/2;
		 merge(arr, beg, mid);
		 merge(arr, mid+1, end);
		 mergeSort(arr, beg, mid, end);
		 }
		 
		 
	 }
	 void mergeSort(int[] arr, int beg, int mid, int end) {
		 int l= beg;
		 int r = mid+1;
		 
		 //make two temp array to store left and right side of array
		 
		 int[] a = new int[l];
		 int[] b = new int[r];
		 
		 //assign left array in new array
		 for(int i=0; i<l; i++) {
			 a[i] = arr[beg+i];
		 }
		 
		 //assign right array in new array
		 for(int j=0; j<r; j++) {
			 b[j] = arr[mid+1+j];
		 }
		 
		 // take three pointers 
		 int i=0; int j=0; int k=beg;
		 
		 while(i< l && j< r) {
			 if(a[i] <= b[j]) {
				 arr[k] = a[i];
				 i++;
				 k++;
				 
			 }else {
				 arr[k] = b[j];
				 j++;
				 k++;
			 }
			 
		 }
		
		 // if array elements are empty in any one
		 
		 while(i <l) {
			 arr[k]= a[i];
			 i++;
			 k++;
		 }
		 while(j<r) {
			 arr[k] = b[j];
			 j++;
			 k++;
			 
		 }
		 
		 
	 }
	
	

	public static void main(String[] args) {
		int[] arr = {22,1,88,3,4,23};
		MergeSort ob = new MergeSort();
		ob.merge(arr, 0, arr.length-1);
		
		System.out.println("sorted array");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		

	}
		

 }	
	


