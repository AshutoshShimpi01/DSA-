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

 OR
if we want to delete the extra n,so write:- sb.delete(2,3);  so delete only 2nd index not 3rd.
*/
