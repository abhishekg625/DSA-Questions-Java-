// find the first non repeating element in the array

package arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FirstNonRepeatingElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		        List<Character> res=new ArrayList<>();
		        boolean get=true;
		        String str=sc.nextLine();
		        for (int i=0;i<str.length();i++){
		            if (!res.contains(str.charAt(i))) {
		                res.add(str.charAt(i));
		                get = true;
		                if (i==str.length()-1){
		                    System.out.println(str.charAt(i));
		                    return;
		                }
		                else {
		                    for (int j = i + 1; j < str.length(); j++) {
		                        if (str.charAt(i) == str.charAt(j)) {
		                            //System.out.println(i);
		                            get = false;
		                            break;
		                        }

		                    }
		                    if (get) {
		                        System.out.println(str.charAt(i));
		                        break;
		                    }
		                }

		            }

		        }
		        sc.close();
		    }
		}
