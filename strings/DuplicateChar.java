package strings;
//find any duplicate charater present in string
public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "programming";
		
		char[] arr= str.toCharArray();
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]== arr[i+1]) {
				System.out.println("duplicate character->  " +arr[i]);
			}
		}

	}

}
