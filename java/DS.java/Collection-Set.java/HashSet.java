// Java HashSet class is used to create a collection that uses a hash table for storage. 
// It inherits the AbstractSet class and implements Set interface.
  
// HashSet stores the elements by using a mechanism called hashing.
// HashSet contains unique elements only.
// HashSet allows null value.
// HashSet class is non synchronized.
// HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
// HashSet is the best approach for search operations.


import java.util.*;  
class HashSet2{  
 public static void main(String args[]){  
  //Creating HashSet and adding elements  
  HashSet<String> set=new HashSet<String>();  
  set.add("Ravi");  
  set.add("Vijay");  
  set.add("Ravi");  
  set.add("Ajay");  
  
//Traversing elements  
  
for( String x: set)
  {
      System.out.println(x + " ");
  }
 }  
}  


// Vijay 
// Ravi 
// Ajay 




