package arrays;

import java.util.Scanner;

public class StocksBuySell1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] price = new int[n];
		for(int i  =0; i<price.length; i++)
		{
			price[i] = sc.nextInt();
			}
		int lsf = Integer.MAX_VALUE;
		 int op = 0;
		int pist= 0;
		for(int i=0; i<price.length;i++)
		{
			if(price[i]< lsf)
			{
				lsf = price[i];
			}
			pist = price[i]-lsf;
			if(pist>op)
			{
				op = pist;
			}
		}
		System.out.println("maximum profit =" +op);
		sc.close();
		}
}
