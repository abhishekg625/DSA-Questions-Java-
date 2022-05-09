package arrays;

public class TrappingRainWater {
	static int rainWater(int[] arr, int n)
	{
		int res=0;
		for(int i=1; i<n-1; i++)
		{
//			int[] left= new int[n];
//			int right[] = new int[n];
			int left = arr[i];
			for(int j= 0; j<i; j++)
			{
				left = Math.max(left, arr[j]);
			}
			int right = arr[i];
			for(int j=i+1; j<n; j++)
			{
			 right = Math.max(right, arr[j]);	
			}
			res+= Math.min(left, right)- arr[i];
			
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,1,2,4,0,1,3,2};
		int n = arr.length;
		System.out.println(rainWater(arr,n));
		

	}

}
