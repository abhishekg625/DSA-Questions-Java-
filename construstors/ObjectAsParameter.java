package construstors;
//passing object as a parameter 
class Test{
	int a,b;
	Test(int i, int j)
	{
		a=i;
		b=j;
		
	}
	boolean equals(Test o)
	{
		if(o.a==a && o.b==b) return true;
		else return false;
		
	}
}
public class ObjectAsParameter {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Test t1 = new Test(100,20);
	Test t2 = new Test(100,20);
	Test t3 = new Test(-1,-1);
	System.out.println("t1==t2 " +t1.equals(t2));
	System.out.println("t2==t3 " +t2.equals(t3));
	
	

	}

}
