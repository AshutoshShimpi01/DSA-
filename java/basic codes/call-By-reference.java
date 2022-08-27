// In case of call by reference original value is changed if we made changes in the called method. If we pass object in place of any primitive value,
// original value will be changed. In this example we are passing object as a value. Let's take a simple example:

import java.util.Scanner;

class java {
    
    public static void call_by_ref(int arr[])
        {
         
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=arr[i]+2;
            }
            System.out.println("---------------");
        
        
        System.out.print(" array element after func ");
          for(int i=0;i<arr.length;i++)
        {
           System.out.print(arr[i] + " ");
        }
        System.out.println("----------------");
        }
        
        
        
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        
        System.out.println();
         
        int arr[] = new int[n];
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("array element before func ");
         for(int i=0;i<arr.length;i++)
        {
           System.out.print(arr[i] + " ");
        }
        
        
        call_by_ref(arr);
        
        
        
         
        }
         
    }
    
    
// 5
// 1 2 3 4 5
// array element before func 1 2 3 4 5 ---------------
// array element after func 3 4 5 6 7 ---------------

