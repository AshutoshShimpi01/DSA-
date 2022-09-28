import java.util.Scanner;

class java
{
    // Function to remove duplicate elements
    // This function returns new size of modified
    // array.
    static int removeDuplicates(int arr[], int n)
    {
        if (n == 0 || n == 1)
            return n;
      
        // To store index of next unique element
        int j = 0;
      
        // Doing same as done in Method 1
        // Just maintaining another updated index i.e. j
        for (int i = 0; i < n-1; i++)
            if (arr[i] != arr[i+1])
                arr[j++] = arr[i];
      
        arr[j++] = arr[n-1];
      
        return j;
    }
     
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        n = removeDuplicates(arr, n);
  
        // Print updated array
        for (int i=0; i<n; i++)
           System.out.print(arr[i]+" ");
    }
}
5   
1 1 2 3 3
1 2 3 %                                                   














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
        
        //for equal temporary array size
        
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

-------------------------------
    
    
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
class HelloWorld {
    public static void main(String[] args) {
        
        
        ArrayList<Integer> numb = new ArrayList<>(Arrays.asList(1,2,3,2));
        
        
        
        Set<Integer> set = new LinkedHashSet<>();
        
        set.addAll(numb);
        
        numb.clear();
        
        numb.addAll(set);
        
        System.out.print(numb + " ");
    }
}
