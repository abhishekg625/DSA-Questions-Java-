package arrays;

/**
 * * TC: O(n * l)
 * * SC: O(c)
	   */ 

import java.util.*;
public class MiniCharForWords2 {

//	public static void main(String[] args) {
//		String words[]={"this","that","did","deed","them!","a"};
//		System.out.println(Arrays.toString(minimumCharactersForWords(words)));
//		
//		}
	
		  public static String[] minimumCharactersForWords(String[] words) {
		    

		    Map<Character, Integer> outerMap = new HashMap<>(), innerMap = new HashMap<>();

		    for (String word : words) {
		      for (char letter : word.toCharArray()) {
		        innerMap.put(letter, innerMap.getOrDefault(letter, 0) + 1);

		        if (!outerMap.containsKey(letter) || outerMap.get(letter) < innerMap.get(letter))
		          outerMap.put(letter, innerMap.get(letter));
		      }

		      innerMap.clear();
		    }

		    return getMinimumChars(outerMap);
		  }

		  private static String[] getMinimumChars(Map<Character, Integer> map) {
		    List<String> list = new ArrayList<>();

		    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
		      String s = String.valueOf(entry.getKey());
		      for (int i = 0; i < entry.getValue(); i++) list.add(s);
		    }

		    String[] chars = new String[list.size()];
		    chars = list.toArray(chars);
		    return chars;
		  }
		

	}


