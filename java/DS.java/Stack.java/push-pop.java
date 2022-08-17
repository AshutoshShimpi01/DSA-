public class java {


    static Node head;
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static boolean isEmpty() {
        return head == null;
    }

    public static void add(int data) {

        Node newNode = new Node(data);


        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public static int pop() {

        if(isEmpty()) {
            return -1;
        }

        int temp = head.data;
        head = head.next;
        return temp;
    }

    public static int peek() {
        if(isEmpty()) {
            return -1;
        }

        return head.data;
    }





    public static void main(String[] args) {
        add(13);
        add(81);
        add(12);
        add(99);
        add(43);

        System.out.println(peek());

        while(!isEmpty()) {
            System.out.println(pop());
        }
    }
}


// 43
// 43
// 99
// 12
// 81
// 13
