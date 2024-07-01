
class linkedList {

    public static class Node {

        int data;
        Node next;

        public Node() {
            next = null;
        }

        public Node(int Data) {
            this.data = Data;
        }
    }

    public static void addNode(int Data, Node head) {
        Node newNode = new Node(Data);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public static void displayList(Node head) {
        Node temp = head;
        System.out.print(temp.data);

        while (temp.next != null) {
            System.out.print(" -> " + temp.next.data);
            temp = temp.next;
        }
    }

    public static void deleteNode(int Data, Node head) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == Data) {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        addNode(2, head);
        addNode(3, head);
        addNode(4, head);
        addNode(5, head);
        addNode(6, head);
        addNode(7, head);
        addNode(8, head);
        deleteNode(6, head);
        displayList(head);
    }
}

// class linkedList {
//     static class node {
//         int data;
//         node next;
//         node(int data) {
//             this.data = data;
//         }
//         node() {
//         }
//         public void add(int data, node head) {
//             node newNode = new node();
//             newNode.data = data;
//             node temp = head;
//             if (head == null) {
//                 head = newNode;
//             } else {
//                 while (temp.next != null) {
//                     temp = temp.next;
//                 }
//                 temp.next = newNode;
//             }
//         }
//         public void display(node head) {
//             node temp = head;
//             while (temp != null) {
//                 System.out.println(temp.data);
//                 temp = temp.next;
//             }
//         }
//         public void delete(int val, node head) {
//             node temp = head;  
//             if (head.data==val) {
//                 head = head.next;
//             }
//             if (head.next.data==0) {
//                 return;
//             }    
//             while( temp!=null){ 
//                 if(temp.next.data == val){
//                     temp.next = temp.next.next;
//                     return;
//                 }
//                 temp = temp.next;
//             }
//         }
//         public void insertAtHead(int data, node head){
//           node newN = new node(data);
//           newN.next = head;
//           head = newN;     
//         }
//     }
//     public static void main(String[] args) {
//         node head = new node(1);
//         head.add(2, head);
//         head.add(3, head);
//         head.add(4, head);
//         head.display(head);
//         head.delete(1, head);
//         head.display(head);
//     }
// }
