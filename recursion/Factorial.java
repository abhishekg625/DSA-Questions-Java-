package recursion;
class Fact{
	int fact(int n) {
		int result;
		if(n==1)
			return 1;
		result = fact(n-1)*n;
		return result;
	}
	}

public class Factorial {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Fact f = new Fact();
	System.out.println("factorial =" +f.fact(5));

	}

}
