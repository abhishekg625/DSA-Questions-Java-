package oopsConcepts;

import javax.swing.JOptionPane;

//class box{                 //yeh banaya hamne ek class
//	                // class ke variable yhi define krne hote hai
//	  int l;
//	  int b;
//	   void vol() {               // yha methods bana rhe hai
//		   System.out.println("volume of fig =");
//		   System.out.println(l*b);
//	   }
//	  }


public class oopsConcepts {
	
	public static void main(String[] args) {
//		box mybox= new box();    // yeh hamne uss class ka object define kiya
//		mybox.b=10;                 // object bana ke usko initialise yha krna hota hai
//		mybox.l=20;
//		
//		mybox.vol(); // yha method ko call kr rhe hai
//		
	 String name;
	 String surname;
	  name = JOptionPane.showInputDialog("please enter your name"); // window popup ke liye use krte hai
	  surname = JOptionPane.showInputDialog("enter surname");
	  JOptionPane.showMessageDialog(null, name+ " " +surname); // popup me likh ke aajaega iss se
	  int fno;
	  int sno;
	  String input;
	  input= JOptionPane.showInputDialog("enter no");
	  fno = Integer.parseInt(input);
	  input = JOptionPane.showInputDialog("entr sno");
	  sno= Integer.parseInt(input);
	  int result= fno+sno;
	  JOptionPane.showMessageDialog(null, +result);
	  
	}

}
