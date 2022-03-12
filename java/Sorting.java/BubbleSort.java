
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