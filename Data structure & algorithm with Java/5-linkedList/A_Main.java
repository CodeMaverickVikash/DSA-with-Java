class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            next = null;
        }
    }

    // Add - first, last
    public void addFirst(int data) {
        if(head == null) {
            head = new Node(data);
        }
        else {
            Node temp = head;
            head = new Node(data);
            head.next = temp;
        }
    }

    public void addLast(int data) {
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

    // Delete - first, last
    public void deleteFirst() {
        if(head == null) {
            System.out.print("List is empty");
        }
        else {
            head = head.next;
        }
    }

    public void deleteLast() {
        if(head == null) {
            System.out.print("List is Empty");
            return;
        }

        if(head.next == null) {
            head = null;
            return;
        }
        
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }


    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

class A_Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        // list.addFirst(12);
        // list.addFirst(32);
        // list.addFirst(90);
        // list.addFirst(80);

        list.addLast(12);
        list.addLast(32);
        list.addLast(90);
        list.addLast(80);

        // list.deleteFirst();
        list.deleteLast();

        list.display();
    }
}