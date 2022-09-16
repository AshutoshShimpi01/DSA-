// Online Java Compiler
// Use this editor to write, compile and run your Java code online


import java.util.Scanner;

class HelloWorld {
    
    public static int dublicate(int arr[],int n)
    
    {
         if (n==0 || n==1){  
            return n;  
        }  
        
        int temp[] = new int[n];
        
        int j=0;

        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                temp[j++]=arr[i];
            }
        }
        
        temp[j++] = arr[n-1];      //same- temp[j] = arr[arr.length-1];
                                     //     j++;
        
         // Changing original array  
        
        for(int i=0;i<j;i++)
        {
            
               arr[i]=temp[i];
                  
        }
        return j;
    }
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        int check = arr.length;
        
        check = dublicate(arr,check);
        
        for(int i=0;i<check;i++)
        {
            System.out.print(arr[i] +" ");
        }
            
        }
    }
    
    
// 5
// 1 1 2 3 3
// 1 2 3 



//SAME-
// temp[j]=arr[i];
//  j++;
