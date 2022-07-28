
/*

in Selection sort we take smallest element and put it forward.

*/

import java.util.Scanner;


public class java
{
  public static void printArray(int arr[])
  {
    for(int i=0;i<arr.length;i++)
    {
    System.out.print(arr[i]+" ");
    }
    System.out.println();
  }  
  

  public static void main(String[] args) 
  {
    
    int arr[]= {7,8,3,1,2}; 
    //selection sort
    for(int i=0;i<arr.length-1;i++)
    {
      int smallest = i;
      for(int j=i+1;j<arr.length;j++)
      {
        if(arr[smallest] > arr[j])
        {
          smallest = j;
        }
      }
     int temp = arr[smallest];
     arr[smallest] = arr[i];
     arr[i] = temp;
     
    }
    
    printArray(arr);
  }
   
}
 
  
/*

1 2 3 7 8 

HOW:-
(one swap per one iteration)

1 8 3 7 2 
1 2 3 7 8 
1 2 3 7 8 
1 2 3 7 8 

*/
















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
   
   for(int i=0;i<arr.length-1;i++)
    {
      int small = i;
      for(int j=i+1;j<arr.length;j++)
      {
        if(arr[small] > arr[j])
        {
          small = j;
        }
      }
     int temp = arr[small];
     arr[small] = arr[i];
     arr[i] = temp;
     
    }

  
   for(int i=0;i<arr.length;i++)
   {
       System.out.println(arr[i]);
   }
   
 
}
}






















