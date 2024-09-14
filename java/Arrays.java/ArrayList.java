
import java.util.Scanner;
import java.util.*;  
public class ArrayListExample2{  
 public static void main(String args[]){  

  List<String> list1 = new ArrayList<String>();

  list1.add("mango");
  list1.add("tomato");
  list1.add("chiku"); 
  

   Collections.sort(list1);  

  

for(String fruit:list1)  
    System.out.println(fruit);  

 }  
}  

//chiku
//mango
//tomato
