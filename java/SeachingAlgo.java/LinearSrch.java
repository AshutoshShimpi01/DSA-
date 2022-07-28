
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

class java
{
    
  
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
   int n = sc.nextInt();
   
   int arr[] = new int[n];
   
   for(int i=0;i<arr.length;i++)
   {
       arr[i] = sc.nextInt();
   }
   
   int key = sc.nextInt();
   
   for(int i=0;i<arr.length;i++)
   {
       if(key == arr[i])
       {
           System.out.println(i);
       }
       else if(key != arr[i])
       {
           System.out.println(" ");
       }
   }
  
 
}
}


/*
5
6 5 4 3 2
3
3




