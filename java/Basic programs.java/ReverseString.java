import java.util.Scanner;


public class java
{
 
  public static void main(String[] args) 
  {


  StringBuilder sb=new StringBuilder("Hello");

  for(int i=0;i< sb.length()/2;i++)
  {
    int front=i;
    int back=sb.length()-1-i; // (for reverse 4 blankplace H go to 5th index) sb.length= 5 - 1 - i=0 = 4
    
    //we find which elements at front(like H) or Back(like o)
    char frontChar = sb.charAt(front);
    char backChar  = sb.charAt(back);

    //To set front char back and back char at front position(REVERSE)
    sb.setCharAt(front, backChar);
    sb.setCharAt(back, frontChar);


  }

  System.out.println(sb);
  
   }
}
 
  
/*
OUTPUT:-
olleH
*/
