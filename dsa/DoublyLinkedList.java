
class DoublyLinkedList {

    class Node {

        int data;
        Node next;
        Node previous;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    Node head;

    public DoublyLinkedList() {
        this.head = null;
    }

    // Method to add a node to the start of the list
    public void addToStart(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
    }

    // Method to add a node to the end of the list
    public void addToEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.previous = temp;
        }
    }

    // Method to print the list from start to end
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        // Adding elements to the start
        list.addToStart(1);
        list.addToStart(2);
        list.addToStart(3);
        System.out.print("List after adding to start: ");
        list.printList();  // Output: 3 2 1

        // Adding elements to the end
        list.addToEnd(4);
        list.addToEnd(5);
        System.out.print("List after adding to end: ");
        list.printList();  // Output: 3 2 1 4 5
    }
}
