package strings;
//count the frequency of each character in a string
import java.util.*;
public class FreqCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Map<Character, Integer> map = new HashMap<>();
		
		//toCharArray-convert the string to character array
		char[] chars = s.toCharArray();
		
		for(char ch:chars) {
			
			//containsKey is used to check key is present in the map or not
			if(!map.containsKey(ch)) {
				
				//put- put the data in the map
				map.put(ch, 1);
			}else {
				
				//get - get the value for the key
				int count = map.get(ch);
				map.put(ch, count+1);
			}
		}
		System.out.print(map);
		
		sc.close();
		

	}

}
