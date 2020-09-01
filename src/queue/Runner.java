package queue;

public class Runner {

	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.enQueue(100);
		queue.show();
		queue.enQueue(200);
		queue.show();
		queue.enQueue(300);
		queue.show();
		queue.enQueue(400);
		queue.show();
		queue.enQueue(500);
		queue.show();
		queue.enQueue(600);
		queue.show();
		queue.enQueue(700);
		queue.show();
		
		System.out.println("size element -->"+queue.getSize());
//		System.out.println("Deqeued element -->"+queue.deQueue());
		
		queue.deQueue();
		queue.show();
		
		queue.deQueue();
		queue.show();
		queue.deQueue();
		queue.show();
		queue.deQueue();
		queue.show();
		queue.deQueue();
		queue.show();
		queue.deQueue();
		queue.show();
		queue.deQueue();
		queue.show();
	}
}
