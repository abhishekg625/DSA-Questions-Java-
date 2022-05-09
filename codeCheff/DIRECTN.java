package codeCheff;
//Chef and Direction

import java.util.*;
public class DIRECTN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
	        int b =0;
	        String str = sc.nextLine();
	        String s = sc.nextLine();
	        for(int i=0;i<n-1;i++)
	        {
	            if((s.charAt(i)=='R' && s.charAt(i+1)=='R')||(s.charAt(i)=='L' && s.charAt(i+1)=='L'))
	            {
	                System.out.println("YES");
	                b=1;
	                break;
	            }
	        }
	        if(b==0)
	        {
	            System.out.println("NO");
	        }
	        sc.close();
	        

	}

}
