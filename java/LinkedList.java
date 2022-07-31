// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
class HelloWorld {
    
    
    public static void main(String[] args) {
        
        
      LinkedList<String> s = new LinkedList<String>();
     
      s.add("Ashu");
      s.add("yogesh");
      s.add("Shri");
      s.add("keshav");
      
     
      Iterator<String> it = s.iterator(); 
      while(it.hasNext())
      {
          System.out.println(it.next());
      }
      
     
      
      
        
    }
}

/*
Ashu
yogesh
Shri
keshav
*/
