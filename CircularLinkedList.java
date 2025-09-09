public class CircularLinkedList {
    Node head = null;
    Node tail = null;

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) { 
            head = newNode;
            tail = newNode;
            newNode.next = head;   
        } else {
            tail.next = newNode;   
            tail = newNode;       
            tail.next = head;      
        }
    }

    public void delete() {
        if (head == null) {
            System.out.println("Circular list is empty, nothing to delete.\n");
            return;
        }

        if (head == tail) { /
            head = null;
            tail = null;
        } else {
            head = head.next;      
            tail.next = head;      
        }

        System.out.println("Deleted node...\n");
    }

    public void display() {
        if (head == null) {
            System.out.println("Circular list is empty.\n");
            return;
        }

        Node current = head;
        System.out.print("Circular Linked List: ");
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);  

        System.out.println("\n");
    }
}
