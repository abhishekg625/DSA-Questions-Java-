package strings;

public class RemDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "Abhishek";
		char[] arr = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<arr.length; i++) {
			boolean repeated = false;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					repeated = true;
					break;
				}
			}
			if(!repeated) {
				sb.append(arr[i]);
				
				
			}
		}
		
		System.out.println(sb);

	}

}
