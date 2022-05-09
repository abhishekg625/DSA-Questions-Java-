package oopsConcepts;
class A{
	int i,j;
	void showij()
	{
		System.out.println(i+ "," +j);
	}
}
class B extends A{
	int k;
	void showk()
	{
		System.out.println(k);
		
	}
	void sum()
	{
		System.out.println(+(i+j+k));
	}
}

public class Inheritence {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A objA = new A();
		B objB = new B();
		objA.i=10;
		objA.j= 20;
		objA.showij();
		System.out.println(".....");
		objB.i=10;
		objB.j=20;
		objB.k=30;
		objB.showij();
		System.out.println(".....");
		objB.showk();
		System.out.println(".....");
		objB.sum();
		
		
		
		
		
	}

}
