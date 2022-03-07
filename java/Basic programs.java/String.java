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

------------------------------------------------
 
 import java.util.Scanner;


public class java
{
 
  public static void main(String[] args) 
  {
  
  String firstname= "Tony";
  String lastname="Stark";
  String fullname=(firstname+lastname);

   System.out.println(fullname);


   for(int i=0;i<fullname.length();i++)
   {
    System.out.println(fullname.charAt(i));
   }

   
    
   }
}
 
  
/*
TonyStark
T
o
n
y
S
t
a
r
k

*/
------------------------------------
 
 import java.util.Scanner;


public class java
{
 
  public static void main(String[] args) 
  {
  
  String name1="Tony";
  
  String name2="Tony";

   


   if(name1.compareTo(name2)==0)
   {
    System.out.println("Strings are equal");
   }
   else
   {
    System.out.println("Strings are not equal");
   }

   
    
   }
}
 
  
/*
if
String name1="Tony";
String name2="Tony";
Strings are equal
    
      OR IF

String name1="Tony";
String name2="Tony2";
Strings are not equal



*/
