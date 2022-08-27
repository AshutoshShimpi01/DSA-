// Online Java Compiler
// Use this editor to write, compile and run your Java code online


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

