package leetCode;

public class RemoveEle {
	public static  void remove(int[] arr, int val){
		int count =0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!= val) {
				arr[count]= arr[i];
				count++;
			}
		}
		System.out.println(count);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,3,2,2};
		int val=2;
		remove(arr, val);
		//System.out.println(remove);

	}

}
