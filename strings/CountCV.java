package strings;
//count consonants and vowels in a string

import java.util.*;
public class CountCV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s = sc.next();
		int Vcount=0, Ccount=0;
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e'||s.charAt(i)=='i'|| s.charAt(i)=='o'||s.charAt(i)=='u' ) {
				Vcount++;
			}
			else {
				Ccount++;
			}
			
		}
		System.out.println("Vowels= " +Vcount+ " Consonants "+Ccount);
		sc.close();

	}

}
