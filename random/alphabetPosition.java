package random;
import java.util.*;
public class alphabetPosition {

	public static int findPosition(char inputLetter)
		{
			// converting input letter in to uniform case. 
			char inputLetterToLowerCase= Character.toLowerCase(inputLetter);
			// COnverting chat in to its ascii value
			int asciiValueOfinputChar= (int)inputLetterToLowerCase;
			// ASCII value of lower case letters starts from 97
			int position= asciiValueOfinputChar-96;
			return position;
			
		}

	public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);
		        
		        char letter= sc.next().charAt(0);
		        int position= alphabetPosition.findPosition(letter);
		        System.out.println(position);
		        sc.close();
				
			}
		

	}

