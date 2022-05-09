  package queue;

public class QueueUsingArray {
	private static int rear , front, count;
	private  static int queue[];
	QueueUsingArray(int c)
	{
		front = rear =0;
		count = c;
		queue = new int[count];
		
		
	}
	static void push(int x)
	{
		if(count ==rear)
		{
			System.out.println("Queue is full");
			return;
			
		}
		else 
		{
			queue[rear] = x;
			rear++;
			
		}
		return;
		
	}
	static void pop()
	{
		if(front == rear)
		{
			System.out.println("Queue is empty");
		 return;
		 
		}
		else
		{
			for(int i=0; i<rear-1; i++)
			{
				queue[i] =queue[i+1];
			}
			//store 0 at rear indicating that their is no element
			if(rear< count)
			{
				queue[rear] =0;
				rear--;
				
			}
		return;
		}
	}
	//display

	static void display()
	{
		if(front == rear)
		{
			System.out.println("Queue is empty");
			return;
			
		}
		else
		{
			for(int i = front ; i<rear; i++)
			{
				System.out.printf("%d <--" , queue[i]);
				
				}
			return;
			
		}
		
	}
	//print queue
	static void front()
	{
		if(front == rear)
		{
			System.out.println("Queue is empty");
			
		}
		else 
		{
			System.out.println(queue[front]);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingArray q = new QueueUsingArray(4);
		
//		QueueUsingArray.push(10);
//		QueueUsingArray.push(20);
//		QueueUsingArray.push(30);
//		QueueUsingArray.push(40);
//		QueueUsingArray.display();
		q.push(10);
		q.push(20);
		q.push(30);
		q.push(40);
		q.display();
		q.pop();
		q.display();
		q.front();
		
		
		
		

	}

}
