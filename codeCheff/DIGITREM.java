package codeCheff;

import java.util.Scanner;
import java.lang.Math;


public class DIGITREM {
	 public static int funcn(int a,int b)
	    {
	        int p=a,rem,count=0,c=0;
	        while(p>0)
	        {
	            rem=p%10;
	            p/=10;
	            c++;
	            if(rem==b)
	            {
	                p=p*(int)Math.pow(10,c)+(rem+1)*(int)Math.pow(10,c-1);
	                count=p-a;
	                c=0;
	            }
	        }
	        return (int)count;
	    }

	public static void main(String[] args) {

	    Scanner sc=new Scanner(System.in);
	    int t;
	    t=sc.nextInt();
	    while(t-->0)
	    {
	        int a,b;
	        a=sc.nextInt();
	        b=sc.nextInt();
	        System.out.println(funcn(a,b));
	    }
	
		
	}


}
