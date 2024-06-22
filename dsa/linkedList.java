
class linkedList {

    static class node {

        int data;
        node next;

        node(int data) {
            this.data = data;
        }
        node() {
        }

        public void add(int data, node head) {
            node newNode = new node();
            newNode.data = data;

            node temp = head;

            if (head == null) {
                head = newNode;
            } else {
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }

        public void display(node head) {
            node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

        public void delete(int val, node head) {
            node temp = head;  

            if (head.data==val) {
                head = head.next;
            }
            if (head.next.data==0) {
                return;
            }    
            while( temp!=null){ 
                if(temp.next.data == val){
                    temp.next = temp.next.next;
                    return;
                }
                temp = temp.next;
            }
        }

        public void insertAtHead(int data, node head){
          node newN = new node(data);
          newN.next = head;
          head = newN;     
        }
    }

    public static void main(String[] args) {
        node head = new node(1);
        head.add(2, head);
        head.add(3, head);
        head.add(4, head);
        head.display(head);
        head.delete(1, head);
        head.display(head);
    }
}
