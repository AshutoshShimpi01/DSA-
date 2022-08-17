// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class LL {
   Node head;
   class Node
   {
       String data;
       Node next;
       
       Node(String data)
       {
           this.data=data;
           this.next=null;
       }
       
   }
       // add First
       
       public void addFirst(String data)
       {
           Node newNode = new Node(data);
           
           if(head == null)
           {
              head = newNode;
              return;
           }
          newNode.next=head;
          head=newNode;
       }
       
       // add Last
       
       public void addLast(String data)
       {
           Node newNode = new Node(data);
           
           if(head == null)
           {
              head = newNode;
              return;
           }
           
           Node currentNode=head;
           while(currentNode.next!=null)
           {
               currentNode = currentNode.next;
           }
           currentNode.next=newNode;
       }
       
       public void printList()
       {
           if(head == null)
           {
               System.out.println("List is empty");
               return;
           }
           Node currentNode=head;
           while(currentNode!=null)
           {
               System.out.print(currentNode.data + " -> ");
               currentNode = currentNode.next;
           }
           System.out.print("Null");
       
       }
       
       
   
    
    public static void main(String[] args) {
        
        LL list = new LL();
        
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        
        list.addLast("list");
        list.printList();
        
        list.addFirst("list");
        list.printList();
    }
}

/*
is -> a -> Null
is -> a -> list -> Nulllist -> 
is -> a -> list -> Null
*/




------------------------
   
   
class LL {
   Node head;
   class Node
   {
       String data;
       Node next;
       
       Node(String data)
       {
           this.data=data;
           this.next=null;
       }
       
   }
       // add First
       
       public void addFirst(String data)
       {
           Node newNode = new Node(data);
           
           if(head == null)
           {
              head = newNode;
              return;
           }
          newNode.next=head;
          head=newNode;
       }
       
       // add Last
       
       public void addLast(String data)
       {
           Node newNode = new Node(data);
           
           if(head == null)
           {
              head = newNode;
              return;
           }
           
           Node currentNode=head;
           while(currentNode.next!=null)
           {
               currentNode = currentNode.next;
           }
           currentNode.next=newNode;
       }
       
       public void printList()
       {
           if(head == null)
           {
               System.out.println("List is empty");
               return;
           }
           Node currentNode=head;
           while(currentNode!=null)
           {
               System.out.print(currentNode.data + " -> ");
               currentNode = currentNode.next;
           }
           System.out.print("Null");
       
       }
       
       public void delFirst()
    {
        if(head==null)
        {
            System.out.print("list is empty");
        }
        head=head.next;
    }
       
       public void delLast()
    {
        if(head==null)
        {
            System.out.print("list is empty");
        }
        
        if(head.next==null)
        {
            head=null;
            return;
        }
        
        Node secLast=head;
        Node lastN=head.next;
        
        while(lastN.next!=null)
        {
            lastN=lastN.next;
            secLast=secLast.next;
        }
        secLast.next=null;
    }
    
       
   
    
    public static void main(String[] args) {
        
        LL list = new LL();
        
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        
        list.addLast("list");
        list.printList();
        
        list.addFirst("list");
        list.printList();
        
        list.delFirst();
        list.printList();
        
        list.delLast();
        list.printList();
        
    }
}
/*

is -> a -> Null
is -> a -> list -> Null
list -> is -> a -> list -> Null
is -> a -> list -> Null
is -> a -> Null



*/
--------------------
   
//SAME
   
class LL {
   Node head;
   class Node
   {
       String data;
       Node next;
       
       Node(String data)
       {
           this.data=data;
           this.next=null;
       }
       
   }
       // add First
       
       public void addFirst(String data)
       {
           Node newNode = new Node(data);
           
           if(head == null)
           {
              head = newNode;
              return;
           }
          newNode.next=head;
          head=newNode;
       }
       
       // add Last
       
       public void addLast(String data)
       {
           Node newNode = new Node(data);
           
           if(head == null)
           {
              head = newNode;
              return;
           }
           
           Node currentNode=head;
           while(currentNode.next!=null)
           {
               currentNode = currentNode.next;
           }
           currentNode.next=newNode;
       }
       
       public void printList()
       {
           if(head == null)
           {
               System.out.println("List is empty");
               return;
           }
           Node currentNode=head;
           while(currentNode!=null)
           {
               System.out.print(currentNode.data + " -> ");
               currentNode = currentNode.next;
           }
           System.out.print("Null");
       
       }
       
       public void delFirst()
    {
        if(head==null)
        {
            System.out.print("list is empty");
        }
        head=head.next;
    }
       
       public void delLast()
    {
        if(head==null)
        {
            System.out.print("list is empty");
        }
        
        if(head.next==null)
        {
            head=null;
            return;
        }
        
        Node secLast=head;
        Node lastN=head.next;
        
        while(lastN.next!=null)
        {
            lastN=lastN.next;
            secLast=secLast.next;
        }
        secLast.next=null;
    }
    
       
   
    
    public static void main(String[] args) {
        
        LL list = new LL();
        
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        
        list.addLast("list");
        list.printList();
        
        list.addFirst("This");
        list.printList();
        
        list.delFirst();
        list.printList();
        
        list.delLast();
        list.printList();
        
    }
}
/*


is -> a -> Null
is -> a -> list -> Null
This -> is -> a -> list -> Null
is -> a -> list -> Null
is -> a -> Null


*/




------------------------------
   
   
public class java{

    static Node head;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }


    public static void addFirst(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }


    public static void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }


    public static void display() {
        if(head == null) {
            System.out.println("Empty");
            return;
        }

        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }

    public static void removeFirst() {
        if(head.next == null) {
            head = null;
            return;
        }

        head = head.next;
    }


    public static void removeLast() {
        Node prev = head;
        Node curr = head.next;

        while(curr.next != null) {
            curr = curr.next;
            prev = prev.next;
        }

        prev.next = null;
    }



    public static void main(String[] args) {
        addFirst(67);
        addFirst(15);
        addFirst(43);

        display();

        addLast(2);
        addLast(94);
        display();

        removeFirst();
        display();
        removeLast();
        display();


// 43 -> 15 -> 67 -> null
// 43 -> 15 -> 67 -> 2 -> 94 -> null
// 15 -> 67 -> 2 -> 94 -> null
// 15 -> 67 -> 2 -> null

    }
}

----------------------------
   
public class java{

    static Node head;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }


    public static void addFirst(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }


    public static void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }


    public static void display() {
        if(head == null) {
            System.out.println("Empty");
            return;
        }

        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }

    public static void removeFirst() {
        if(head.next == null) {
            head = null;
            return;
        }

        head = head.next;
    }


    public static void removeLast() {
        Node prev = head;
        Node curr = head.next;

        while(curr.next != null) {
            curr = curr.next;
            prev = prev.next;
        }

        prev.next = null;
    }


    public static void rev() {
        Node prev = head;
        Node curr = head.next;

        while(curr != null) {
            Node nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }

        head.next = null;
        head = prev;
    }

    public static void main(String[] args) {
        addFirst(67);
        addFirst(15);
        addFirst(43);

        display();

        addLast(2);
        addLast(94);
        display();

        removeFirst();
        display();
        removeLast();
        display();

        rev();
        display();


// 43 -> 15 -> 67 -> null
// 43 -> 15 -> 67 -> 2 -> 94 -> null
// 15 -> 67 -> 2 -> 94 -> null
// 15 -> 67 -> 2 -> null
// 2 -> 67 -> 15 -> null

    }
}
