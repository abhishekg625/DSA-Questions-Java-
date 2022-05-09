package linkedList;

public class MyLinkedlist {
	public static class Node{
		int data;
		Node next;
		
	}
	public static class LinkedList{
		Node head;
		Node tail;
		int size;
	
		
	//Add element to the last 
	void Addlast(int val)
	{
		Node temp= new Node();
		temp.data= val;
		temp.next= null;
		if(size==0)
		{
			head= tail= temp;
		}else 
		{
		
		tail.next= temp;
		tail= temp;
		}
		size++;
	}
	public int size() {
		return size;
		
	}
	//display data
	public void display() {
		Node temp= head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp= temp.next;
		}
		System.out.println();
	}
	public void removeFirst() {
		if(size==0) {
			System.out.println("list is empty");
			
		}else if(size==1) {
				head= tail= null;
				size=0;
			}
			
		
		else {
			head= head.next;
			size--;
		}
		
	}
	public int getFirst() {
		if(size==0) {
			System.out.println("list is empty");
			return -1;
		}else {
			return head.data;
		}
		
	}
	public int getLast() {
		if(size==0) {
			System.out.println("list is empty");
			return -1;
		}else {
			return tail.data;
		}
		
	}
	public int getAt(int idx) {
		if(size==0) {
			System.out.println("list is empty");
			return -1;
		}else if(idx<0 || idx >=size) {
			
				System.out.println("wrong input");
				return -1;
			
		}else {
			Node temp= head;
			for(int i=0; i<idx; i++) {
				temp= temp.next;
			}
			return temp.data;
		}
		
	}
	
	}


	public static void main(String[] args) {
		LinkedList list= new LinkedList();
		list.Addlast(10);
		list.Addlast(20);
		list.Addlast(30);
		list.Addlast(40);
		list.Addlast(50);
		//list.removeFirst();
		list.display();
		//list.size();
		list.getAt(3);
		System.out.println(list.getAt(3));
		System.out.println(list.size());
		
		
		
		
	}

}
