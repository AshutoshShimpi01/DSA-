import java.util.Scanner;


public class java
{
 
  public static void main(String[] args) 
  {


  StringBuilder sb=new StringBuilder("Tony");
  System.out.println(sb);

  sb.insert(0,'S');
  System.out.println(sb);

  
   }
}
 
  
/*
Tony
STony

 OR
if we want Tonny so we write:- sb.insert(2,'n');
*/