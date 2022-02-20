class LinkedList<E> {
	//E is the Class defining the type of the inputs accepted
	Node<E> head;

	// Node of the linkedlist
	public static class Node<E> {
		public E data;
		public Node<E> next;

		//constructor
		public Node(E data) {

			this.data = data;
			next = null;
		}
	}

	// Add element operation - first, last
	public void add(E data) {
		Node<E> toAdd = new Node<E>(data);

		if (isEmpty()) {
			head = toAdd;
			return;
		}

		//initialising temp as head to traverse the Linked list without breaking the chain
		Node<E> temp = head;
      	// control from loop exits as soon as next element becomes null
		while (temp.next != null) {

			temp = temp.next;
		}
    	// adding the new node after reaching to the end of linked list
		temp.next = toAdd;
	}

	// Delete - first, last
	public void removeLast() throws Exception {
		Node<E> temp = head;

		if (temp == null) {
			throw new Exception("Cannot remove last element from empty linked list");
		}

		if (temp.next == null) {
			Node<E> toRemove = head;
			head = null;
			// return toRemove.data;
		}

		while (temp.next.next != null) {
			temp = temp.next;
		}
		Node<E> toRemove = temp.next;
		temp.next = null; // changing the pointer of temp.next from toRemove to null,and garbage collection is done automatically
		// return toRemove.data;
	}

	// Peek last element from the linked list
	public E getLast() throws Exception {
		Node<E> temp = head;

		if (temp == null) {
			throw new Exception("Cannot peek last element from empty linked list");
		}
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}

	// To check linkedlist is empty or not
	public boolean isEmpty() {
		return head == null;
	}

	// Traverse linkedlist 
	public void print() {
		Node<E> temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}

// Driven code
class B_GenericMain {
    public static void main(String[] args) throws Exception {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(12);
        list.add(11);
        list.add(14);

        list.print();

        // System.out.print(list.isEmpty());

		// list.removeLast();
		// System.out.print(list.getLast());
    }
}

// to create package command --- package comprises .class file
// javac -d . .\LinkedList.java
