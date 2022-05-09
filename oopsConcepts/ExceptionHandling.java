package oopsConcepts;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int n=0;
			int div= 100/n;
			System.out.println(div);
			
			
		}catch(ArithmeticException e){
			System.out.println("divide by zero exception");
		}
		finally {
			int y=10;
			System.out.println(y);
		}
		

	}

}
