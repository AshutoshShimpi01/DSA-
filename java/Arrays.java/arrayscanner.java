import java.util.Scanner;


public class java
{
 
  public static void main(String[] args) 
  {
   Scanner sc=new Scanner(System.in);
   int size=sc.nextInt();

   int n[]=new int[size];

   for(int i=0;i<size;i++)
   {
   n[i]=sc.nextInt();
   }
   for(int i=0;i<size;i++)
   {
    System.out.println(n[i]);
   }
}
 
  }  
/*
5
23
12
32
35
66

23
12
32
35
66
*/

-----------------------------
import java.util.Scanner;


public class java
{
 
  public static void main(String[] args) 
  {
   Scanner sc=new Scanner(System.in);
   int size=sc.nextInt();

   int n[]=new int[size];

   for(int i=0;i<size;i++)
   {
   n[i]=sc.nextInt();
   }
   int x=sc.nextInt();

   for(int i=0;i<n.length;i++)
   {
    if(n[i]==x)

    System.out.println(i);
   }
}
 
  }  
/*
5
23
12
32
35
66

23
12
32
35
66
*/
