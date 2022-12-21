/* Implementing Simple Queue using array */
// class Queue {
//  int queue[];
//     int capacity;
//     int rear = -1;

// 	Queue(int size) {
// 		this.capacity = size;
// 		queue = new int[capacity];
// 	}

// 	// enqueue - O(1)
// 	public void add(int data) {
// 		if (rear == (capacity-1)) {
// 			System.out.printf("\nQueue is full\n");
// 			return;
// 		}

//         rear++;
// 		queue[rear] = data;
// 	}

// 	// dequeue - O(n)
// 	public int remove() {
// 		if (rear == -1) {
// 			System.out.printf("\nQueue is empty\n");
// 			return -1;
// 		}

//         int front = queue[0];
// 		for (int i = 0; i<rear; i++) {
// 			queue[i] = queue[i+1];
// 		}
//         rear--;
//         return front;
// 	}

//     // peek - O(1)
//     public int peek() {
// 		if (rear == -1) {
// 			System.out.printf("\nQueue is empty\n");
// 			return -1;
// 		}

//         return queue[0];
// 	}

//     public boolean isEmpty() {
//         return (rear == -1);
//     }
// }

// // Driver code
// class Main {
// 	public void main(String[] args) {
// 		// Create a queue of capacity 4
// 		Queue q = new Queue(4);
// 		q.add(20);
// 		q.add(30);
// 		q.add(40);

// 		while(!q.isEmpty()) {
//             System.out.print(q.peek() +" ");
//             q.remove();
//         }
// 	}
// }

/* Implementing Circular Queue using array */
// class CircularQueue {
//  int queue[];
//     int capacity;
//     int rear = -1, front = -1;

// 	CircularQueue(int size) {
// 		this.capacity = size;
// 		queue = new int[capacity];
// 	}

//     public boolean isEmpty() {
//         return (rear == -1 && front == -1);
//     }

//     public boolean isFull() {
//         return (rear+1) % capacity == front;
//     }

// 	// enqueue - O(1)
// 	public void add(int data) {
// 		if (isFull()) {
// 			System.out.printf("\nQueue is full\n");
// 			return;
// 		}
//         // 1st element add
//         if(front == -1) {
//             front = 0;
//         }

//         rear = (rear+1) % capacity;
// 		queue[rear] = data;
// 	}

// 	// dequeue - O(1)
// 	public int remove() {
// 		if (isEmpty()) {
// 			System.out.printf("\nQueue is empty\n");
// 			return -1;
// 		}

//         int result = queue[front];
//         // single element condition
// 		if(rear == front) {
//             rear = front = -1;
//         } else {
//             front = (front+1) % capacity;
//         }
//         return result;
// 	}

//     // peek - O(1)
//     public int peek() {
// 		if (isEmpty()) {
// 			System.out.printf("\nQueue is empty\n");
// 			return -1;
// 		}

//         return queue[front];
// 	}
// }

// // Driver code
// class Main {
// 	public void main(String[] args) {
// 		CircularQueue q = new CircularQueue(5);
// 		q.add(1);
// 		q.add(2);
// 		q.add(3);
// 		q.add(4);
// 		q.add(5);
//         System.out.println(q.remove());
//         q.add(6);
//         System.out.println(q.remove());
//         q.add(7);

// 		while(!q.isEmpty()) {
//             System.out.println(q.remove());
//         }
// 	}
// }


/* Implementing queue using LinkedList */
class Queue {
    Node head = null;
    Node tail = null;

    class Node {
       int data;
       Node next;

       Node(int data) {
           this.data = data;
           next = null;
       }
   }
 
   public boolean isEmpty() {
        return head == null && tail == null;
    }
 
    public void add(int data) {
        Node newNode = new Node(data);
        if(isEmpty()) {
            tail = head = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
 
    public int remove() {
        if(isEmpty()) {
            System.out.println("empty queue");
            return -1;
        }
        int front = head.data;
        //single node
        if(head == tail) {
            tail = null;
        }
        head = head.next;
        return front;
    }
 
    public int peek() {
        if(isEmpty()) {
            System.out.println("empty queue");
            return -1;
        }
        
        return head.data;
    }
}


class Main {
    public static void main(String args[]) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
   }
}
