package random;
import java.util.Scanner;

public class PrimeNo {
	public static boolean isPrime(int n)
	{
		if(n==0 || n==1)
		{
			return false;
			
		}
		else 
		{
			for(int i=2 ; i<=n/2; i++)
			{
				if(n%i==0)
				{
					return false;
					
				}
				
					return true;
					
				
			}
			
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("PrimeNo=" +isPrime(n));

		sc.close();
		
		

	}

}
