package strings;

public class PalindromeRecusion {
	static boolean isPalin(String s, int l, int r)
	{
		// if only one string
		if(l>=r)
			return true;
		
		if((s.charAt(l))!= (s.charAt(r)))
			return false;
		return isPalin(s, l+1,r-1);
		
	}
	static boolean isPalin(String s)
	{
		int n = s.length();
		//check for empty string 
		//consider as palindrome 
		if(n==0)
			return true;
		return isPalin(s, 0, n-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "abba";
		if(isPalin(s))
			System.out.println("yes");
		else 
			System.out.println("no");
		
		

	}

}
