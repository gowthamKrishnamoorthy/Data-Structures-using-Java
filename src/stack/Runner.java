package stack;

public class Runner {

	public static void main(String[] args) {
		MyStack stack = new  MyStack();
		System.out.println("Is Empty --->"+stack.isEmpty());
		stack.push(100);
		stack.show();
		stack.push(200);
		stack.show();
		stack.push(300);
		stack.show();
		stack.push(400);
		stack.show();
		stack.push(500);
		stack.show();
		stack.push(600);
		stack.show();
		
		System.out.println("Is Empty --->"+stack.isEmpty());
		
		stack.pop();
		stack.show();
		stack.pop();
		stack.show();
		stack.pop();
		stack.show();
		stack.pop();
		stack.show();
		stack.pop();
		stack.show();		
		
		System.out.println("Peeked element --->"+stack.peek());
		
		System.out.println("poped element --->"+stack.pop());
		
		System.out.println("size is --->"+stack.size());
		
		
		
	}

}
