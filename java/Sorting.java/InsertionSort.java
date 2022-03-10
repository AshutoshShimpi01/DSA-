
/*

in Insertion sort we divide array in to two parts. 

1st sorted part  & 2nd unsorted part

then we take element one by one and sort it.

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
    //Insertion sort
    for(int i=1;i<arr.length;i++)
      {
        int current = arr[i];
        int j = i-1;

        while(j >= 0 && current < arr[j])
        {
          arr[j+1] = arr[j];
          j--;
        } 
        //placement
        arr[j+1] = current;
      }
      printArray(arr);
  }
   
}
 
  
/*

1 2 3 7 8 

HOW:-
(one swap per one iteration)

7 8 3 1 2 
3 7 8 1 2 
1 3 7 8 2 
1 2 3 7 8 

*/
