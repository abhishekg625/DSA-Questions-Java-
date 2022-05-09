package codeCheff;
//Find that given three sides can form a tringle or not

import java.util.Scanner;
public class ValidTringle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c = sc.nextInt();
		double s= (a+b+c)/2;
		double tri = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		if(tri>0) {
			System.out.println("yes");
		}else
		{
			System.out.println("no");
		}
		sc.close();

	}

}
