package random;
import java.util.Scanner;


public class PrimePairSum {
	public static boolean isPrime( int num)
	{
		if(num==0|| num==1)
		{
			return false;
			
		}
		for(int i=2; /* i<=num/2; */ i*i<= num; i++)
		{
			if(num%i ==0)
			{
				return false;
				
			}
		}
	
	return true;
	}
	public static int primePairSum(int[] arr, int n)
	{
		int count =0;
		for(int i=0; i<n;i++)
		{
			for(int j=i+1; j<n; j++)
			{
				int sum = arr[i]+arr[j];
				if(isPrime(sum)) 
				{
					count++;
					
				}
				
			}
		}
		return count;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i=0;i<arr.length; i++)
		{
			int n = arr.length;
			arr[i] = sc.nextInt();
			//int[] arr = { 1, 2, 3, 4, 5};
		    
		
	        System.out.println(primePairSum(arr, n));
		}
		
		

	}

}
