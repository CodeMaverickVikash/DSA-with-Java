/* Implementing stack using array */
// class Stack {
// 	int a[];
// 	int top;
// 	int capacity;

//     public Stack(int size) {
// 		this.capacity = size;
// 		top = -1;
// 		a = new int[capacity];
// 	}

// 	void push(int data) {
// 		if (top == (capacity - 1)) // stack full
// 			System.out.println("Stack Overflow");
// 		else 
// 			a[++top] = data;
// 	}

// 	int pop() {
// 		if (top < 0) {
// 			System.out.println("Stack Underflow");
// 			return 0;
// 		}
// 		else {
// 			int res = a[top];
// 			top--;
// 			return res;
// 		}
// 	}

// 	int peek() {
// 		if (top < 0) {
// 			System.out.println("Stack Underflow");
// 			return 0;
// 		}
// 		else 
// 			return a[top];
// 	}

// 	boolean isEmpty() {
// 		return (top < 0);
// 	}
	
// 	void print() {
// 		for(int i = 0; i<=top; i++) {
// 			System.out.print(" "+ a[i]);
// 		}
// 	}
// }

// // Driver code
// class Main {
// 	public static void main(String args[]) {
// 		Stack s = new Stack(3);
// 		s.push(10);
// 		s.push(20);
// 		s.push(30);
// 		System.out.println(s.pop() + " Popped from stack");
// 		System.out.println("Top element is :" + s.peek());

// 		System.out.print("Elements present in stack :");
// 		s.print();
// 	}
// }


/* Implementing stack using LinkedList */
class Stack {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) { 
			this.data = data;
			next = null; 
		}
	}

	public void push(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
		}
	}

	public int pop() {
		if (head == null) {
			return -1;
		}
		int top = head.data;
		head = head.next;
		return top;
	}

	public int peek() {
		if (head == null) {
			return -1;
		}
		else {
			return head.data;
		}
	}

	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		else
			return false;
	}
}

// Driver code
class A_Main {
	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(10);
		st.push(20);
		st.push(30);

		while(!st.isEmpty()) {
			System.out.print(st.peek() + " ");
			st.pop();
		}
	}
}
