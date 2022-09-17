// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;
class Main {
    
    
    public static int binarySearch(int arr[],int key,int low,int high)
    {
        
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            
            
            if(arr[mid]==key)
            {
                return mid;
            }
            
            if(arr[mid] < key)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
            return -1;
    }
    public static void main(String[] args) {
       
     
    int[] array = { 3, 4, 5, 6, 7, 8, 9 };
    int n = array.length;

  
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter element to be searched:");

    int Key = sc.nextInt();
    
    int result = binarySearch(array, Key, 0, n - 1);
    
    if (result == -1)
    {
      System.out.println("Not found");
    }
    else
    {
      System.out.println("Element found at index " + result);
    }  
       
    }
}



// Enter element to be searched:
// 5
// Element found at index 2




----------------
    
//USING RECURSSION
    
 int binarySearch(int array[], int element, int low, int high) {

    if (high >= low) {
      int mid = low + (high - low) / 2;

      // check if mid element is searched element
      if (array[mid] == element)
        return mid;

      // Search the left half of mid
      if (array[mid] > element)
        return binarySearch(array, element, low, mid - 1);

      // Search the right half of mid
      return binarySearch(array, element, mid + 1, high);
    }

    return -1;
  }
