//to check String is anagram or not
package strings;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "mary";
		String str2 = "army";
		char[] arr1 = str1.toCharArray();
		char[] arr2= str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		boolean result = Arrays.equals(arr1, arr2);
		if(result)
		{
			System.out.println("Anagrams");
			
		}
		else
		{
			System.out.println("Not Anagrams");
		}
		
	}
	

}
