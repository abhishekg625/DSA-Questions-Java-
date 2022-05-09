package javaCollections;
//ArrayList Practice question.
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList objArray = new ArrayList();
		ArrayList objArray2 = new ArrayList();
		objArray2.add(0,"common1");
		objArray2.add(1,"common2");
		objArray2.add(2,"notcommon");
		objArray2.add(3,"notcommon1");
		objArray.add(0,"common1");
		objArray.add(1,"common2");
		objArray.add(2,"notcommon2");
		
		System.out.println("Array elements of 1= " +objArray);
		System.out.println("Array elements of 2= " +objArray2);
		
		
		//objArray2 ke saare elements udaa dega aur sath me objArray ke jo common elements hai wo bhi
		objArray.removeAll(objArray2);
		
		//objArray.removeAll(objArray);
		
		System.out.println("output X: " +objArray);
		
		
		

	}

}
