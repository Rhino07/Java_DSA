
public class LinkedList {

    public class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node Tail;
    public int size;

    public void addFirst(int data) {
        //step 1 create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = Tail = newNode;
            return;
        }
        //step 2 linking 
        newNode.next = head;
        //step 3 assignment 
        head = newNode;

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = Tail = newNode;
            return;
        }

        Tail.next = newNode;
        Tail = newNode;

    }

    public void addMiddle(int data, int idx) {
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("Empty List");
        } else if (size == 1) {
            int temp = head.data;
            head = Tail = null;
            size--;
            return temp;
        }
        int temp = head.data;
        head = head.next;
        size--;
        return temp;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("Empty List");
        } else if (size == 1) {
            int temp = head.data;
            head = Tail = null;
            return temp;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int temp = prev.next.data;//value from last node
        prev.next = null;
        Tail = prev;
        size--;
        return temp;

    }

    public void printLL() {
        Node temp = head;

        if (head == null) {
            System.out.println("Empty");
            return;
        }
        while (temp != null) {
            System.out.println(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public int search(int key) {
        Node temp = head;
        int i = 0;

        while (i < size) {
            if (temp.data == key) {
                return i;
            }

            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helperREcSearch(Node head, int key) {
        //base case
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helperREcSearch(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recusionSearch(int key) {

        return helperREcSearch(head, key);
    }

// DSA problem 1
    public void reverse() {
        Node prev = null;
        Node curr = Tail = head;// right to left assignment

        while (curr != null) {
            Node next = curr.next; //
            curr.next = prev; // Braking forward links and pointing to null
            prev = curr; //
            curr = next;
        }
        head = prev;
    }

//DSA Cyclic
    public void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean loop = false;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
                loop = true;
                slow = head;
                break;
            }
        }
        Node prev = null;

        if (loop) {
            while (slow != fast) {
                prev = fast;
                fast = fast.next;
                slow = slow.next;
            }
        }
        prev.next = null;
    }

    public Node delete_N_nodes(Node head, int M, int N) {

        // Node finalList=null;
        Node temp = head;
        int count;
        while (temp != null) {

            for (count = 1; temp != null && count < M; count++) {
                // finalList=temp;
                temp = temp.next;
            }
            if (temp == null) {
                break;
            }
            Node temp2 = temp.next;
            for (count = 1; count <= N && temp2 != null; count++) {
                temp2 = temp2.next;
            }
            temp.next = temp2;
            temp = temp2;
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(8);
        ll.addFirst(7);
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printLL();
        ll.delete_N_nodes(ll.head, 3, 2);
        ll.printLL();
    }

}
