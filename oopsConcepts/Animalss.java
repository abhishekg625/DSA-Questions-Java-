package oopsConcepts;
//over ridding concepts

public class Animalss {
	public void eat() {
		System.out.println("Animals are eating");
		
	}
}

	class Humans extends Animalss{
	public void eat()
	{
		
	
		System.out.println("humans are eating");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Humans h1= new Humans();
		h1.eat();

	}

	}
