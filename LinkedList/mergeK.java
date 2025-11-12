
public class mergeK {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node mergeKnodes(Node arr[], int k) {
        if (k == 0) {
            return
        }
        mergeKnodes(arr, k - 1);

    }

    public Node sort() {
    }

    public static void main(String args[]) {
        int k = 3; // Number of linked lists

        Node arr[] = new Node[k];

        // Linked list 1
        arr[0] = new Node(1);
        arr[0].next = new Node(3);
        arr[0].next.next = new Node(5);
        arr[0].next.next.next = new Node(7);

        // Linked list 2
        arr[1] = new Node(2);
        arr[1].next = new Node(4);
        arr[1].next.next = new Node(6);
        arr[1].next.next.next = new Node(8);

        // Linked list 3
        arr[2] = new Node(0);
        arr[2].next = new Node(9);
        arr[2].next.next = new Node(10);
        arr[2].next.next.next = new Node(11);
    }
}
