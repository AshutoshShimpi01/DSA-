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
        
       
       int key = sc.nextInt();
       
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i] == key)
           {
               System.out.print(i);
           }
       }
        
        
    }
}

/*
5
5 4 3 2 1
2
3
1
2
3
4
5


*/
