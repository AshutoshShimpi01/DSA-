// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;
class HelloWorld {
    
    
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
               if(arr[small]>arr[j])
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

/*
5
5 4 3 2 1

1
2
3
4
5


*/
