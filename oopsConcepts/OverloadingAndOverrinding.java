package oopsConcepts;
class Overloading{
	//OverLoading Concept
		public void Car(String s)
		{
			
			System.out.println(s);
		}
		public void Car(String s, int price)
		{
			System.out.println(s +"   " +price);
			
		}
}
//Overriding
class Human{
	public void eat()
	{
		System.out.println("humans  eat");
	}
	
	}
class Boy extends Human{
	public void eat()
	{
		System.out.println("boy is eating");
	}
}

public class OverloadingAndOverrinding {
	
	public static void main(String[] args)
	{
		//overloading wala
		Overloading obj = new Overloading();
		 
		obj.Car("BMW");
		obj.Car("BMW", 30000);
		
		//overriding wala
		Boy obj1 = new Boy();
		
		//this will call the child class version 0f eat
		obj1.eat();
		
		
		
	}

}
