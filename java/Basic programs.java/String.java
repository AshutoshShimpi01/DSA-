import java.util.Scanner;


public class java
{
 
  public static void main(String[] args) 
  {
   Scanner sc=new Scanner(System.in);
   
   String name=sc.nextLine();

   System.out.println("My name is: "+name);
    
   }
}
 
  
/*
Ashutosh Sanjay Shimpi
My name is: Ashutosh Sanjay Shimpi

if we only take String name=sc.next(); then only print Ashutosh not all
*/

----------------------------
 
 import java.util.Scanner;


public class java
{
 
  public static void main(String[] args) 
  {
  
  String firstname= "Tony";
  String lastname="Stark";
  String fullname=(firstname+" "+lastname);

   System.out.println(fullname);
    
   }
}
 
  
/*
Tony Stark

suppose we want to know length of the character so use: 

System.out.println(fullname.length);
OUTPUT is: 10
(space also included)
*/
