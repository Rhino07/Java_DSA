
public class LinkedList2 {

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

    public Node getMid(Node head) {

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }

        return slow;
    }

    public Node merge(Node head1, Node head2) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergeLL.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = getMid(head);

        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft, newRight);

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
    }

    public void zigzag() {

        Node mid = getMid(head);

        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node RightHead = prev;
        Node LeftHead = head;

        Node nextL, nextR;

        while (LeftHead != null && RightHead != null) {

            nextL = LeftHead.next;
            LeftHead.next = RightHead;
            nextR = RightHead.next;
            RightHead.next = nextL;
            //update
            LeftHead = nextL;
            RightHead = nextR;

        }

    }

    public static void main(String[] args) {

        LinkedList2 ll = new LinkedList2();

        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.printLL();
        ll.zigzag();
        ll.printLL();

    }

}
