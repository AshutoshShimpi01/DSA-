public class java {

    static Node front;
    static Node rear;


    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }


    public static boolean isEmpty() {
        if(front == null && rear == null) {
            return true;
        }else {
            return false;
        }
    }

    public static void add(int data) {
        Node newNode = new Node(data);

        if(isEmpty()) {
            front = newNode;
            rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = rear.next;

    }


    public static int remove() {
        if(isEmpty()) {
            System.out.println("Err");
            return -1;
        }

        if(front == rear) {
            int temp = front.data;
            front = null;
            rear = null;
            return temp;
        }

        int temp = front.data;
        front = front.next;
        return temp;
    }


    public static void main(String[] args) {
        add(43);
        add(654);
        add(223);
        add(24);

        while(!isEmpty()) {
            System.out.println(remove());
        }
    }
}

// 43
// 654
// 223
// 24
