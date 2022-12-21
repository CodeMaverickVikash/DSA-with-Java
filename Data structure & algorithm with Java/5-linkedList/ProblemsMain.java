// Linkedlist means singly linkedlist
class Node {
	int data;
	Node next;

	Node(int d) {
		this.data = d;
		next = null;
	}
}

class LinkedList {
    Node head;
    public void add(int data) {
        if(head == null) {
            head = new Node(data);
        }
        else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
    }

    public Node buildLinkedList(int item[]) {
        for(int i=0; i<item.length; i++) {
            add(item[i]);
        }

        return head;
    }
}

class ProblemSolver {
	public void printList(Node head) {
		Node temp = head;
		while(temp != null) { // last node
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public int middleElement(Node head) {
		// Naive solution - O(N) + O(N/2)
		// Node tmp = head;
        // int count = 1;
        // while(tmp.next != null) {
        //     count++;
        //     tmp = tmp.next;
        // }
		
        // int mid = count/2;
		// Node temp = head;
        // for(int i=1; i<=mid; i++) {
		// 	temp = temp.next;
		// }
        // return temp.data;
		// Efficient solution - O(N)
		Node slow_ptr = head;
		Node fast_ptr = head;

		while(fast_ptr != null && fast_ptr.next != null) {
			// System.out.print(fast_ptr.data);
			fast_ptr = fast_ptr.next.next;
			slow_ptr = slow_ptr.next;
		}
		return slow_ptr.data;
	}

	/* We will use three-pointers to traverse through the entire list and interchange links between nodes. One pointer to keep track of the current node in the list. The second one is to keep track of the previous node to the current node and change links. Lastly, a pointer to keep track of nodes in front of current nodes. */
	public Node reverseList(Node head) { // O(n)
        Node current = head;
		Node prev = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
	}
}


// Driver code
class ProblemsMain {
	public static void main(String[] args) {
		int listItem[] = {1, 2, 3, 4, 5, 6}; 
        LinkedList list = new LinkedList();
        Node head = list.buildLinkedList(listItem);

        ProblemSolver p = new ProblemSolver();

		// Problem 1: Find the middle element of the linkedlist 
		// System.out.print(p.middleElement(head));

		// Problem 2: Reverse a linked list
		Node revList = p.reverseList(head);
		p.printList(revList);
		
	}
}