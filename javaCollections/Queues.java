package javaCollections;
import java.util.*;
public class Queues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> que = new LinkedList<Integer>();
		que.offer(12);
		que.offer(8);
		que.offer(1998);
		que.add(98);
		System.out.println(que);
		
		System.out.println(que.poll());
		que.offer(98);
		
		
		System.out.println(que.peek());
		
		
		

	}

}
