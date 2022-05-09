/*A map is an object that stores associations between keys and values, or key/value pairs. Given
a key, you can find its value. Both keys and values are objects. The keys must be unique, but
the values may be duplicated. Some maps can accept a null key and null values, others cannot
 * */

package javaCollections;
import java.util.*;
public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String>mp = new HashMap<>();
		mp.put(1, "Abhishek");
		mp.put(2, "Kumar");
		mp.put(3, "Giri");
		
		System.out.println(mp);
		System.out.println(mp.get(2));
		for(Map.Entry<Integer, String>e:mp.entrySet()) {
			System.out.println(e);
			
			System.out.println(e.getKey());
			System.out.println("---------------------");
			System.out.println(e.getValue());
			System.out.println("++++++++++++++++++++++++");
			for(Integer key:mp.keySet()) {
				System.out.println(key);
				
				for(String val: mp.values()){
					System.out.println(val);
				}
			}
		}
		
		
		

	}

}
