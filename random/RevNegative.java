package random;
//reverse a negative integer 
public class RevNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reversed=0;
		int num= -1546;
		while(num != 0) 
		{
		   int digit = num % 10;
		   reversed = reversed * 10 + digit;
		   num /= 10;
		}
		System.out.println(reversed);

	}

}
