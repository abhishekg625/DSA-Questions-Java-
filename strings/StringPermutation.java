package strings;
import java.util.Scanner;

public class StringPermutation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		printpermutation(str,"");
		sc.close();
		}
	public static void printpermutation(String que, String asf) {
		if(que.length()==0)
		{
			System.out.println(asf);
			return;
		}
		for(int i=0; i<que.length();i++) {
			char ch = que.charAt(i);
			String qlpart= que.substring(0, i);
			String qrpart = que.substring(i+1);
			String roq= qlpart+qrpart;
			printpermutation(roq, asf+ch);
		}
	}

}
