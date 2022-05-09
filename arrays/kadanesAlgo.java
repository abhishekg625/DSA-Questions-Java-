//find the largest sum of subarray aka kadanes Algo

package arrays;
import java.util.Scanner;
public class kadanesAlgo {
	public static int Solution(int[] arr)
	{
		int Csum = arr[0];
		int Osum = arr[0];
		for(int i =1; i<arr.length; i++)
		{
			if(Csum>=0)
			{
				Csum+= arr[i];   //Csum = Csum+arr[i]
			}
			else
			{
				Csum = arr[i];
			}
			if(Csum>Osum)
			{
				Osum = Csum;
			}
		}
		return Osum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(Solution(arr));
		sc.close();

	}

}
