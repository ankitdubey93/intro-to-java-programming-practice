public class LinkedList {
    Node head;

    public void insert(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void reverse() {
        Node previous = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        head = previous;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insert("Ankit");
        linkedList.insert("Nishaad");
        linkedList.insert("Diya");
        linkedList.insert("Ruben");

        System.out.println("Original Linked List:");
        linkedList.display();

        linkedList.reverse();

        System.out.println("Reversed Linked List:");
        linkedList.display();
    }
}
