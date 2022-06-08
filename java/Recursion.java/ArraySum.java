// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

public class reverse{
    public static int  sum(int n,int arr[])
{
    
    if(n<0) 
    {
        return 0;
        
    }
  return sum(n-1, arr) +  arr[n];
 
}

    public static void main(String[] args) {
    
    reverse r = new reverse();
    
    int size =5;
    int Arr[] = {1,2,3,4,5,6};
    
    
    r.sum(size,Arr);

	    
		System.out.println(sum(size,Arr));
      
    
 

    }
}

//21
