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
        
        int max=arr[0];
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > max) max = arr[i];
        }
        System.out.println(max);
    }
}

/*
4
6 5 4 3
6
