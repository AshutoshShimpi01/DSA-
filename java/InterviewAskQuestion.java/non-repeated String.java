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
