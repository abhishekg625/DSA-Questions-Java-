//All the operations on Strings
package strings;

import java.util.Arrays;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abhishek";
		String str2 = "giri";
		
		
		// concate bothe the Strings
		
		String str3 = str1 + str2;
		
		//covert in upper case
		String str4= str1.toUpperCase()+ str2.toUpperCase();
		
		//getting length of Strings
		
		int n= str1.length();
		int m= str2.length();
		
		//compare length of both the strings
		int str5= str1.compareTo(str2);
		//compares equal or not
		
		if(str1.compareTo(str2)==0)
		{
			System.out.println("equal strings");
		}else {
			System.out.println("not equals");
		}
		// concate in one 
		str1= str1.concat(str2);
		System.out.println(str1);
		//check for contains
		
		boolean str6 = str1.contains("a");
		System.out.println(str6);
		System.out.println(str1.substring(0,2).toUpperCase());
		System.out.println(str1.charAt(2));
		char[] str7= str1.toCharArray();
		char[] str8= str2.toCharArray();
		System.out.println("array = "+Arrays.toString(str7));
		System.out.println("array2 = " +Arrays.toString(str8));
		
		String str9= "aba";
		String str10="aba";
		
		
		System.out.println("Concated  = " +str3);
		System.out.println("Concated in uppercase  = " +str4);
		System.out.println("length of Strings= " +n+""+m);
		System.out.println(str5);
		
		
		//comapare each character value
		boolean ss= str9.contentEquals(str10);
		if(ss) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		

	}

}
