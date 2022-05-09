package random;

import java.util.Scanner;

public class Fabonacii {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s1= sc.nextInt();
		int s2= sc.nextInt();
		int n= sc.nextInt();
		printFabonacii(s1,s2,n);
		sc.close();

	}
	static void printFabonacii(int s1, int s2, int n) {
		int s3; int count=1;
		if(0<n) {
			s3= s1+s2;
			System.out.println(s3);
			s1=s2;
			s1=s3;
			//printFabonacii(s1,s2,n);
			count++;
			
			}
		}

}
