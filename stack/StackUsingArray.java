package stack;

public class StackUsingArray {
	int MAX = 1000;
	int top =-1;
	int a[] = new int [MAX];
	boolean isEmpty() {
		return (top<0);
	}
	boolean push(int x)
	{
		if(top>=(MAX-1))
		{
			System.out.println("overflow");
			return false;
			}
		else
		{
			 a[++top] = x;
			 System.out.println("pushed =" +x);
			 return true;
			
			}
	}
	int pop()
	{
		if(top<0)
		{
			System.out.println("under flow");
			return 0;
			
		}
		else {
			int x = a[top--];
			return x;
			
			}
	}
	int peek()
	{
		if(top<0)
		{
			System.out.println("underflow");
			return 0;
			
		}
		else
		{
			int x= a[top];
			return x;
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingArray s = new StackUsingArray();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s.pop()+ "  -popped");
		
		

	}

}
