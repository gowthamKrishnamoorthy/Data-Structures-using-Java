package queue;

public class MyQueue {
	int queue[] = new int[5];
	int size;
	int front;
	int rear;
	public void enQueue(int data) {
		if(!isFull()) {
			queue[rear] = data;
			rear = (rear+1)%5;
			size = size+1;
		}else {
			System.out.println("QUEUE is full");
		}
		
	}
	
	public int deQueue() {
		int data = queue[front];
		if(!isEmpty()) {
		front = (front+1)%5;
		size = size-1;
		}else {
			System.out.println("Queue is empty");
		}
		return data;
	}
	
	public void show() {
		System.out.print("Element : ");
		for(int i=0;i<size;i++) {
			System.out.print(queue[(front+i)%5]+" ");
		}
		System.out.println();
	}
	public int getSize() {
		return size;
	}
	public boolean isEmpty() {
		return getSize() == 0;
	}
	public boolean isFull() {
		return getSize() == 5;
	}

}
