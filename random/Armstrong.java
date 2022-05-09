package random;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no= 153;
		int t1 =no; 
		int leng=0;
		
		//find length of the number
		while(t1!=0)
		{
			leng = leng+1;
			t1= t1/10;
			
		}
		//finding armstrong no

		int t2 = no; 
		int rem;
		int arms=0;
		while(t2!=0)
		{
			int mul =1;
			rem = t2%10;
			for(int i=1; i<= leng; i++)
			{
				 mul = mul*rem;
				}
			arms = arms+mul;
			t2= t2/10;
		}
		if(arms==no)
		{
			System.out.println("yes its armstrong =" +no);
			
		}
		else  
		{
			System.out.println("not armstrong = " +no);
		}
		

	}

}
