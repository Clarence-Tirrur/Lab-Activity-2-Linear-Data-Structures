import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        Stack<Integer> stackData = new Stack<>();
        Queue<Integer> queueData = new LinkedList<>();
        LinkedList<Integer> linkedListData = new LinkedList<>();
        CircularLinkedList circularListData = new CircularLinkedList();

        int mainChoice;

        while(true) {
            System.out.println("Choose Data Structure:\n1.Stack\n2.Queue\n3.Linked List"
                    + "\n4.Circular Linked List\n5. Exit");
            System.out.print("Enter choice: ");
            mainChoice = inputScanner.nextInt();
            System.out.println();

            switch (mainChoice) {
                case 1:
                    while (true) {
                        System.out.println("--- Stack Operations ---");
                        System.out.println("1. Push\n2. Pop\n3. Display\n4. Exit Stack Operations");
                        System.out.print("Enter choice: ");
                        int stackChoice = inputScanner.nextInt();

                        if (stackChoice == 1) {
                            System.out.print("Enter value to push: ");
                            int pushValue = inputScanner.nextInt();
                            stackData.push(pushValue);
                            System.out.println("Pushed " + pushValue + " into stack.\n");

                        } else if (stackChoice == 2) {
                            if (stackData.isEmpty()) {
                                System.out.println("Stack is empty, nothing to pop.\n");
                            } else {
                                int poppedValue = stackData.pop();
                                System.out.println("Popped: " + poppedValue + "\n");
                            }
                        } else if (stackChoice == 3) {
                            if (stackData.isEmpty()) {
                                System.out.println("Stack is empty.\n");
                            } else {
                                System.out.print("Stack contents: ");
                                for (int i = stackData.size() - 1; i >= 0; i--) {
                                    System.out.print(stackData.get(i) + " ");
                                }
                                System.out.println("\n");
                            }
                        } else if (stackChoice == 4) {
                            System.out.println();
                            break;
                        } else {
                            System.out.println("Invalid choice.\n");
                        }
                    }
                    break;

                case 2:
                    while(true){
                        System.out.println("--- Queue Operations ---");
                        System.out.println("1. Enqueue\n2. Dequeue\n3. Display\n4. Exit Queue Operations");
                        System.out.print("Enter choice: ");
                        int queueChoice = inputScanner.nextInt();

                        if(queueChoice == 1){
                            System.out.print("Enter value to enqueue: ");
                            int enqueueValue = inputScanner.nextInt();
                            if(queueData.offer(enqueueValue)){
                                System.out.println("Enqueued " + enqueueValue + " into queue");
                                System.out.println();
                            } else {
                                System.out.println("Failed to enqueue value.");
                            }
                        } else if(queueChoice == 2){
                            Integer dequeuedValue = queueData.poll();
                            if(dequeuedValue == null){
                                System.out.println("Queue is empty. There is nothing to dequeue.");
                            } else{
                                System.out.println("Dequeued: " + dequeuedValue);
                                System.out.println();
                            }
                        } else if (queueChoice == 3){
                            if(queueData.isEmpty()){
                                System.out.println("Queue is empty. ");
                                System.out.println();
                            } else {
                                System.out.println("Queue contents: " + queueData);
                                System.out.println();
                            }
                        } else if(queueChoice == 4){
                            System.out.println();
                            break;
                        }
                    }
                    break;

                case 3:
                    while(true) {
                        System.out.println("\n--- Linked List Operations ---");
                        System.out.println("1. Insert at end\n2. Delete at beginning\n3. Display\n4. Exit Linked List Operations");
                        System.out.print("Enter choice: ");
                        int linkedChoice = inputScanner.nextInt();

                        if(linkedChoice == 1){
                            System.out.print("Enter value to insert: ");
                            int insertValue = inputScanner.nextInt();
                            linkedListData.add(insertValue);
                            System.out.println("Inserted " + insertValue + " at the end of the linked list.");
                        } else if(linkedChoice == 2){
                            if (linkedListData.isEmpty()){
                                System.out.println("Linked List is empty.");
                            } else{
                                int deletedValue = linkedListData.removeFirst();
                                System.out.println("Deleted first element: " + deletedValue);
                            }
                        } else if (linkedChoice == 3){
                            if(linkedListData.isEmpty()){
                                System.out.println("Linked List is currently empty.");
                            } else{
                                System.out.println("Linked List: " + linkedListData );
                            }
                        } else if(linkedChoice == 4){
                            System.out.println();
                            break;
                        }else{
                            System.out.println("Invalid input.");
                        }
                    }
                    break;

                case 4:
                    while(true) {
                        System.out.println("--- Circular List Operations ---");
                        System.out.println("1. Insert\n2. Delete\n3. Display\n4. Exit Circular List Operations");
                        System.out.print("Enter choice: ");
                        int circularChoice = inputScanner.nextInt();

                        if(circularChoice == 1){
                            System.out.print("Enter the value to insert: ");
                            int circularValue = inputScanner.nextInt();
                            circularListData.insert(circularValue);
                            System.out.println("Inserted " + circularValue + " into circular linked list. \n");

                        } else if(circularChoice == 2){
                            circularListData.delete();
                        } else if(circularChoice == 3){
                            circularListData.display();
                        } else if(circularChoice == 4){
                            System.out.println();
                            break;
                        } else {
                            System.out.println("Invalid input.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;
            }
        }
    }
}
