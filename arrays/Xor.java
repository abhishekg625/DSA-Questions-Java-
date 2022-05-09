package arrays;
//Find element that appears once in array rest appears twice

//import java.util.*; 
public class Xor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int temp=0;
		int[] arr = {2,2,3,4,5,4,5};
		int result=arr[0];
		//HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=1; i<arr.length;i++) {
			result = result^arr[i];
		
		
		}
		System.out.println(result);
	}

}
