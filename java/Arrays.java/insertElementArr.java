import java.lang.*;
import java.util.*;

class java
{
public static void main(String[] args)
{

int A[] = new int[10];

A[0]=3;A[1]=9;A[2]=7;A[3]=8;A[4]=12;A[5]=6;

int n=6;

for(int i=0;i<n;i++)
{
System.out.print(A[i]+",");
System.out.println("");
}

int index=2;
int x=20;

 //Inserting new numb
for(int i=n;i>index;i--)

A[i]=A[i-1]; // Right shifted from 6 and arrSize is 10
A[index]=x;

//Printing array
for(int i=0;i<=n;i++)

System.out.print(A[i]+",");
System.out.println("");

 
}

}
/*
3,
9,
7,
8,
12,
6,
3,9,20,7,8,12,6,

*/
