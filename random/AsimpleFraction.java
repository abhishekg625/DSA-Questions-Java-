package random;

import java.util.HashMap;
import java.util.Scanner;


public class AsimpleFraction {
	
	public static String solution(int num, int den)
	{
		StringBuilder ans = new StringBuilder();
		int q= num/den;
		int r = num%den;
		ans.append(q);
		if(r==0)
		{
			return ans.toString();
		}
		else 
		{
			ans.append(".");
			HashMap<Integer, Integer> map = new HashMap<>();
			
			while(r!=0)
			{
				if(map.containsKey(r))
				{
					int len = map.get(r);
					ans.insert(len, "(");
					ans.append(")");
					break;
					
					
				}
				else 
				{
					
				map.put(r, ans.length());
				r =r*10;
				q=r/den;
				r = r%den;
				ans.append(q);
				
			}
		}
		return ans.toString();
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int num= sc.nextInt();
		int den = sc.nextInt();
		System.out.println (solution(num, den));
		
		sc.close();
		

	}

}
