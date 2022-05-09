package strings;
//convert the first letter of string in upper case
public class FirstUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "abhishek kumar giri";
		//String result = str.substring(0, 1).toUpperCase()+str;
		String f = "";
		str = " "+str;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch== ' ') {
				f= f+ch;
				i++;
				ch= str.charAt(i);
				f= f+ Character.toUpperCase(ch);
				
				
			}
			else {
				f=f+ch;
			}
		}
		
		
		
		System.out.println(f);
	}

}
