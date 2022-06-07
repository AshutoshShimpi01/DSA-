//Code not run due to error



import java.lang.*;
import java.util.*;

class java
{
public static void main(String[] args)
{

int A[]={3,9,7,8,12,6,15,5,4,10};

for(int x:A) //For Each loop

System.out.print(x+",");
System.out.println("");


int temp = A[0];

for(int i=0;i<A.length;i++)
{
A[i-1]=A[i];
}

A[A.length-1]= temp;

for(int x:A)

System.out.print(x+",");
System.out.println("");


 
}

}
 

/*
(base) ashutoshsanjayshimpi@Ashutoshs-MBP MyJava %  java java     
3,9,7,8,12,6,15,5,4,10,
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: -1
	at java.main(java.java:21)
*/

