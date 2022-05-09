package arrays;
import java.util.*;
public class MiniCharForWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				String words[]={"this","that","did","deed","them!","a"};
				System.out.println(Arrays.toString(solve(words)));
			}
			static String[] solve(String[] words){
		        if(words.length == 0)
		            return new String[0];
		            
		        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		        
		        for(char ch : words[0].toCharArray())
		            map.put(ch, map.getOrDefault(ch, 0) + 1);
		        
		        for(int i = 1; i < words.length; i++){
		            Map<Character, Integer> temp = new HashMap<>();
		            
		            for(char ch : words[i].toCharArray())
		                temp.put(ch, temp.getOrDefault(ch, 0) + 1);
		                
		            for(char key : temp.keySet())
		                map.put(key, Math.max(map.getOrDefault(key, 0), temp.get(key)));
		        }
		        
		        ArrayList<Character> list = new ArrayList<>();
		        for(char ch : map.keySet()){
		            int n = map.get(ch);
		            while(n-- > 0)
		                list.add(ch);
		        }
		        
		        String[] ans = new String[list.size()];
		        int i = 0;
		        for(char ch : list){
		            ans[i++] = ""+ch;
		        }
		        
		        return ans;
		    }
		

	}


