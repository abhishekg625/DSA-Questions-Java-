//third string is valid suffle of first and second string or not
package strings;

import java.util.Arrays;

public class ValidSuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abc";
		String str2= "def";
		String str3= "adbecf";
		System.out.println("" +isValidSuffle(str1,str2,str3));
	}

	static boolean isValidSuffle(String str1, String str2, String str3) {
		
		char[] arr1 = str1.toCharArray();
		Arrays.sort(arr1);
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr2);
		char[] arr3 = str3.toCharArray();
		Arrays.sort(arr3);
		
		int i=0,j=0,k=0;
		while(k<arr3.length)
		{
			if(i<arr1.length&& arr1[i]== arr3[k])
				i++;
			else if(j<arr2.length && arr2[j] == arr3[k])
				j++;
			else return false;
			
				k++;
				
		}
		return i>= arr1.length && j>= arr2.length;
		
	}

}
