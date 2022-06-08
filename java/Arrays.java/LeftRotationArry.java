import java.util.Scanner;

    public class check
    {
       

    public static void main(String args[])
    {
        int arr[] ={1,2,3,4,5};
        
        for(int x:arr)
        
            System.out.print(x+ " ");
            System.out.println("");
       int temp=arr[0];
       
       for(int i=1;i<arr.length;i++)
       {
           arr[i-1]=arr[i];  //THIS IS FOR LEFT ROTATE.  AND   arr[i]=arr[i-1] THIS IS FOR RIGHT INDEX SHIFTING
       }
       arr[arr.length-1]=temp;
       for(int x:arr)
        
        System.out.print(x+" ");
        System.out.println("");
    }
    
}

/* 1 2 3 4 5 
   2 3 4 5 1 
*/   
