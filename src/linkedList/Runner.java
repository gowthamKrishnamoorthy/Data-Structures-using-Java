package linkedList;

public class Runner {

	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		
		list.insertAtStart(0);
		
		list.insertAt(0, 1000);
		list.deleteAt(1);
		
		list.show();
		
	}

}
