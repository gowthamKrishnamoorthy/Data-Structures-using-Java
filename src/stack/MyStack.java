package stack;

public class MyStack {

	int capacity = 2;
	int stack[] = new int[capacity];
	int top = 0;
	public void push(int data) {
		if(size() == capacity) {
			expandStack();
		}
		stack[top] = data;
		top++;
	}
	private void expandStack() {
		int length = size();
		int newStack[] = new int[capacity*2];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
		capacity = capacity*2;
	}
	public int pop() {
		int data = 0;
		if(isEmpty()) {
			System.out.println("Stack is empty");	
		}else {
			top--;
			data = stack[top];
			stack[top] = 0;
			shrinkStack();
		}
		return data;
	}

	private void shrinkStack() {
		int length = size();
		if(length<=(capacity/2)/2) {
			capacity = capacity/2;
		}
		int newStack[] = new int[capacity];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;

	}
	public void show() {
		System.out.print("Element:");
		for(int n:stack) {
			System.out.print(n+" ");
		}
		System.out.println();
	}

	public int peek() {
		int data = 0;
		if(isEmpty()) {
			System.out.println("Stack is empty");	
		}else {
			data = stack[top-1];
		}
		return data;
	}

	public int size() {
		return top;
	}

	public Boolean isEmpty() {
		return top <=0 ;
	}
}
