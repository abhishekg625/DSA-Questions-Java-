package strings;
import java.util.*;
public class remExtraSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		StringBuilder s=new StringBuilder();
		Character c;
		for (int i=0;i<str.length();i++){
		    if (str.charAt(i)!='_'&&s.isEmpty()){
		        s.append(str.charAt(i));
	        }
		    if (i>0){
		        c=str.charAt(i-1);
	        }
		    if (i>0&&str.charAt(i)!='_'&&str.charAt(i-1)!='_'){
		        s.append(str.charAt(i));
	        }
	    }
		System.out.println(s);

	}

}
