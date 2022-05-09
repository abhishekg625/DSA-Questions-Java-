package leetCode;

public class MoveZeros {
	public static void moveZero(int[] arr){
		int nonMaxZero=0;
		for(int cur=0; cur<arr.length; cur++)
		{
			if(arr[cur]!=0)
			{
				swap(arr, cur, nonMaxZero++);
			}	
	}
	}
		public static void swap(int[] arr, int i, int j)
		{
			int temp= arr[i];
			arr[i]= arr[j];
			arr[j]=temp;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,0,3,12};
		int n= arr.length;
		for(int i=0; i<n; i++)
		{
			moveZero(arr);
			
		System.out.print(arr[i]+" ");
		}
	
}
	}
