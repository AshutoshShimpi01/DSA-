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
X:
35
index of x:
3
*/


----------------------------------
 
 import java.lang.*;
import java.util.*;

class java
{
public static void main(String args[])
{


int arr[] = {4,10,2};
int key =6;
for(int i=0;i<arr.length;i++)
{

if(i==key)
{

System.out.println(i);
System.exit(0);

}

}

System.out.println("Not Found");


}

}


//output-Not Found
