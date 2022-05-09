package oopsConcepts;

//abstract keyword is used
//not able to instantiate
//all the methods which are declared which doe'nt define or implement  
abstract class Animals{
	abstract void eat();
}
class Dog extends Animals {
	void eat() {
		System.out.println("they eating");
	}
	
}
public class Abstract {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	//not able to instantiate
	Animals obj = new Dog();
	obj.eat();
	}
}
