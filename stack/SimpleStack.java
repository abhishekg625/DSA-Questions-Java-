package stack;
class Stack{
	int[] stck = new int[10];
	int top;
	Stack()
	{
		top =-1;
		
	}
	void push(int item)
	{
	if(top==9)
	
		System.out.println("stack is full");
	
	else
		stck[++top]= item;
	System.out.println(item);
	}
	int pop()
	{
		if(top <0) {
		System.out.println("stack is empty");
		return 0;
	}
		else
			return stck[top--];
			}
}

public class SimpleStack {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack mystack = new Stack();
		mystack.push(10);
		mystack.push(20);
		mystack.push(30);
		mystack.push(40);
		mystack.pop();
		System.out.println("poped items-"+mystack.pop());
		}

}
