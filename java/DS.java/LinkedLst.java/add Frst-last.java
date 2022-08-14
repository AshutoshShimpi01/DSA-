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
