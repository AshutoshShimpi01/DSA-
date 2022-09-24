//Java TreeSet class implements the Set interface that uses a tree for storage.
// Java TreeSet class contains unique elements only like HashSet.
// Java TreeSet class access and retrieval times are quiet fast.
// Java TreeSet class doesn't allow null element.
// Java TreeSet class is non synchronized.
// Java TreeSet class maintains ascending order.


import java.util.*;  
class TreeSet1{  
 public static void main(String args[]){  
  //Creating and adding elements  
  TreeSet<String> al=new TreeSet<>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");  
  //Traversing elements  

  for( String i:al)
  {
      System.out.println(i + " ");
  }
 }  
}  

// Ajay
// Ravi 
// Vijay 



--------------
  
  
import java.util.*;    
class TreeSet3{    
 public static void main(String args[]){    
 TreeSet<Integer> set=new TreeSet<Integer>();    
         set.add(24);    
         set.add(66);    
         set.add(12);    
         set.add(15);    
         System.out.println("Lowest Value: "+set.pollFirst());    
         System.out.println("Highest Value: "+set.pollLast());    
 }    
}    

// Lowest Value: 12
// Highest Value: 66
