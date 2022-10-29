import java.util.*;
public class Main {
 public static void main(String[] args) {
  String str1 = "gibblegabbler";
  System.out.println("string is: " + str1);
  
  
  for (int i = 0; i < str1.length(); i++) {
   boolean unique = true;
   for (int j = 0; j < str1.length(); j++) {
    if (i != j && str1.charAt(i) == str1.charAt(j)) {
     unique = false;
     break;
    }
   }
   if (unique) {
    System.out.println( str1.charAt(i));
    break;                                // When we remove break then all non repeated string are shown
   }
  }
 }
}

// CODE ONLY FOR FIRST NON_REPEATED STRING

// string is: gibblegabbler
// i


----------------------
 
 
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        
        
        String s= "geeksforgeeks";
        
        for(int i=0;i<s.length();i++)
        {
            boolean uni = true;
            for(int j=0;j<s.length();j++)
            {
                if(i!=j && s.charAt(i)==s.charAt(j))
                {
                    uni = false;
                    break;
                }
            }
            if(uni)
            {
                System.out.print(s.charAt(i));
                
            }
        }
    }
}

//for

-----------------------




// REPEATED STRING

class HelloWorld {
    public static void main(String[] args) {
        
        
        String s= "geeksforgeeks";
        
        for(int i=0;i<s.length();i++)
        {
            boolean uni = true;
            for(int j=0;j<s.length();j++)
            {
                if(i!=j && s.charAt(i)==s.charAt(j))
                {
                    uni = false;
                    break;
                }
            }
            if(!uni)
            {
                System.out.print(s.charAt(i));
                
            }
        }
    }
}

// geeksgeeks
