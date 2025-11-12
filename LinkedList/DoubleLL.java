
public class DoubleLL {

    class Node {

        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("emptyLL");
            return;
        }

        if (head == tail) { // only one node
            head = tail = null;
            return;
        }

        tail = tail.prev;
        tail.next = null;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("emptyLL");
            return;
        }

        if (head == tail) { // only one node
            head = tail = null;
            return;
        }

        head = head.next;
        head.prev = null;

    }

    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void print() {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        DoubleLL dll = new DoubleLL();

        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.addFirst(5);
        dll.addFirst(6);
        dll.print();
        dll.addLast(7);
        dll.print();
        dll.deleteLast();
        dll.print();

    }

}
