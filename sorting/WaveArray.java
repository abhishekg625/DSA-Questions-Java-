package sorting;

public class WaveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6};
		
		for(int i =0; i<arr.length; i++)
		{
			if(i%2==0)
			{
				if(arr[i]<arr[i+1])
				{
			
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1]= temp;
					
				}
				else
				{
					if(arr[i]>arr[i+1])
					{
						int temp = arr[i];
						arr[i] = arr[i+1];
						arr[i+1]= temp;
						}
				}
			}
		
				
			System.out.print(arr[i]+" ");
		}
			
	}
	}
