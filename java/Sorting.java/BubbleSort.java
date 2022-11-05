/*
                 Bst      Avg.    Worst     Space(w)
// Bubble Sort-	 Ω(n)	  θ(n^2)	  O(n^2)	       O(1)

*/
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int arr[] = new int[n];
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int count = 1;
        
      while(count<n)
      {
          for(int i=0;i<n-count;i++)
          {
              if(arr[i]>arr[i+1])
              {
                  int temp = arr[i];
                  arr[i] = arr[i+1];
                  arr[i+1] = temp;
              }
          }
          count++;
      }
        
   for(int i=0;i<arr.length;i++)
   {
    System.out.println(arr[i]);
   }
        
        
    }
}

/*
6
8 4 9 2 5 3
2
3
4
5
8
9





__________________________________________________________________





// In Bubble sort we can push the largest element at last position.

import java.util.Scanner;


public class java
{
  public static void printArray(int arr[])
  {
    for(int i=0;i<arr.length;i++) // array.length is ( number(5)-1 )
    {
    System.out.print(arr[i]+" ");
    }
    System.out.println();
  }  
  

  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int arr[] = new int[size];

    for(int i=0;i<size;i++)
    {
      arr[i]=sc.nextInt();
    }
    //time complexity= O(n^2) nsquare
    // BubbleSort
    for(int i=0;i<size-1;i++)   //outer loop run (n-1)times
    {
     for(int j=0;j<size-1;j++) //inner loops run n,n-1,n-2,....times
     {
      if(arr[j] > arr[j+1])
      {
        //swap
        int temp = arr[j];
        arr[j]=arr[j+1];
        arr[j+1] = temp;

      }

     }
     
    }
    printArray(arr); 
  }
   
}
 
  
/*

5
3 2 6 1 5
1 2 3 5 6 

HOW:-
 
5
3 2 6 1 5 :-

2 3 1 5 6  1st compare with indeex 0 and 1, a[0]>a[1]=swap REPEAT
2 1 3 5 6  AGAIN same
1 2 3 5 6 
1 2 3 5 6 



*/


__________________________________________________________________







//ESAY



// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

class java
{
    
  
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    
    int n = 6;
    
    int arr[] = {8,4,5,2,6,2};
    
    int count = 1;
    
    while(count < n)
    {
        for(int i=0;i<n-count;i++)
        {
            if(arr[i]>arr[i+1])
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        count ++;
    }
     for(int i=0;i<arr.length;i++)
   {
    System.out.println(arr[i]);
   }
        
    }
}




