//que based on sub string from codecheff
package codeCheff;

import java.util.Scanner;


public class FRK {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int count =0;
		for(int i=0; i<n;i++) {
		String str= sc.next();
		if(str.contains("ch"))
			count++;
		else if(str.contains("he"))
			count++;
		else if(str.contains("ef"))
			count++;
		else if(str.contains("chef"))
			count++;
		}
		System.out.println(count);
				
	
		
		sc.close();

	}

}
