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
---------------------------------
 
 import java.util.Scanner;


public class java
{
 
  public static void main(String[] args) 
  {


  StringBuilder sb=new StringBuilder("H");

  sb.append("e");
  sb.append("l");
  sb.append("l");
  sb.append("o");

  System.out.println(sb);
  
   }
}
 
  
/*
Hello

if we want to do same like this in string so

str=str + "e";
str=str + "l";
str=str + "l";
str=str + "o";
*/
 
