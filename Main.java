public class CircularLinkedList {
    private Node headNode = null;
    private Node tailNode = null;

    public void insert(int newValue) {
        Node newNode = new Node(newValue);

        if (headNode == null) {
            headNode = newNode;
            tailNode = newNode;
            newNode.nextNode = headNode;
        } else {
            tailNode.nextNode = newNode;
            newNode.nextNode = headNode;
            tailNode = newNode;
        }
    }

    public void delete() {
        if (headNode == null) {
            System.out.println("Circular linked list is empty.");
            return;
        }

        if (headNode == tailNode) {
            headNode = null;
            tailNode = null;
        } else {
            headNode = headNode.nextNode;
            tailNode.nextNode = headNode;
        }
    }

    public void display() {
        if (headNode == null) {
            System.out.println("Circular linked list is empty.");
            return;
        }

        Node currentNode = headNode;
        do {
            System.out.print(currentNode.dataValue + " ");
            currentNode = currentNode.nextNode;
        } while (currentNode != headNode);

        System.out.println();
    }
}
