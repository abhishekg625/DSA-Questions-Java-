/*
 * Chef buys a lottery ticket that has a 3 digit code associated with it. He thinks that digit 7 is his lucky digit and brings him good luck. Chef will win some amount in the lottery if at least one of the digits of the lottery ticket is 7.

Given three digits A, B, and C of the lottery ticket, tell whether Chef wins something or not?
 */

package codeCheff;

//import java.util.Scanner;

public class LUCKYNUM {
	public static int getres(int n){
		int count=0;
		while(n!=0) {
			count = n%10;
			if(n==count) {
				System.out.println("yes");
				break;
			}else {
				System.out.println("no");
				break;
			}
			
		}
		return n;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=668;
		System.out.println(getres(n));
	}

	}


