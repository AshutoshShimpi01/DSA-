// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

class java
{
    
  
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
   String s = "Vinod";
   String str = "";
   
   for(int i=s.length()-1;i>=0;i--)
   {
       str+=String.valueOf(s.charAt(i));
   }
   
   System.out.println(str);
        
    }
}

//doniV







// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

class java
{
    
  
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
   String s = "Vinod";
   StringBuilder sb = new StringBuilder(s);
   
   System.out.println(sb.reverse());
   //String str = "";
   
   /*
   for(int i=s.length()-1;i>=0;i--)
   {
       str+=String.valueOf(s.charAt(i));
   }
   
   System.out.println(str);
        
    }
    */
    }
}

