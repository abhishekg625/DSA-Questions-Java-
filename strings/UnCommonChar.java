package strings;
import java.util.*;
public class UnCommonChar {
	private static void getres(String matchh, String patern) {
        ArrayList<Character> c=new ArrayList<>();
        for (int i=0;i<matchh.length();i++){
            boolean res=true;
            if (c.contains(matchh.charAt(i))){
                continue;
            }
            for (int j=0;j<patern.length();j++){
                if (matchh.charAt(i)==patern.charAt(j)){
                    res=false;
                    break;
                }
            }
            if (res&&!c.contains(matchh.charAt(i))){
                c.add(matchh.charAt(i));
            }
        }

        for (int i=0;i<patern.length();i++){
            boolean res=true;
            if (c.contains(matchh.charAt(i))){
                continue;
            }
            for (int j=0;j<matchh.length();j++){
                if (matchh.charAt(i)==patern.charAt(j)){
                    res=false;
                    break;
                }
            }
            if (res&&!c.contains(matchh.charAt(i))){
                c.add(matchh.charAt(i));
            }
        }

        for (Character k:c){
            System.out.print(k+" ");
        }


    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "abhishek";
		String str2= "abhilash";
		
		getres(str1,str2);
		
		
		
		
	}

}
