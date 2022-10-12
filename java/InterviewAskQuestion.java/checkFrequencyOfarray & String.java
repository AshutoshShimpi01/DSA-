// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class java {
    
    
    
    public static void main(String[] args) {
        
        
        int arr[] = {1,1,2,3,2,2,4,7};
        
        int fr[] = new int[arr.length];
        
        int check=-1;
        
        
        for(int i=0;i<arr.length;i++)
        {
            int count=1;
            
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    fr[j]=check;
                }
            }
            if(fr[i]!=check)
            {
                fr[i]=count;
            }
        }
        
        System.out.println("---------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------"); 
        
        for(int i=0;i<arr.length;i++)
        {
            if(fr[i]!=check)
            {
                System.out.println(" "+ arr[i] + " " + fr[i]);
            }
            System.out.println("---------------");   
        }
        
    }
}


// ---------------
//  Element | Frequency
// ---------------
//  1 2
// ---------------
// ---------------
//  2 3
// ---------------
//  3 1
// ---------------
// ---------------
// ---------------
//  4 1
// ---------------
//  7 1
// ---------------




import java.util.*;
import java.util.Scanner;

class code
{

    
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
       



       
       int arr[] = {1,2,1,3,4,5,2,4,9};

       int fr[] = new int[arr.length];


       int check = -1;

       for(int i=0;i<arr.length;i++)
       {
        int count=1;

        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]==arr[j])
            {
                count++;
                fr[j]=check;
            }
        }
        if(fr[i]!=check)
        {
            fr[i]=count;
        }
       }

       for(int i=0;i<arr.length;i++)
       {
           if(fr[i]!=check && fr[i]<2)
        System.out.println(arr[i] + " ");
       }
    }
}

// 3 
// 5 
// 9 


----------------------------------------


//Take Input from user


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
        
        int fr[] = new int[arr.length];
        
        int check=-1;
        
        for(int i=0;i<arr.length;i++)
        {
            int count=1;
            
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    fr[j]=check;
                }
            }
            if(fr[i]!=check)
            {
                fr[i]=count;
            }
        }
        
        for(int i=0;i<arr.length;i++)
        {
            if(fr[i]!=check)
            {
                System.out.println(arr[i]+" "+fr[i]);
            }
            System.out.println("----------");
        }
    }
}


------------------
    
    
    
import java.util.Scanner;
 
public class StringOperator
{
   public static void main(String args[])
   {
        int i;
        String str;
 
        int count[] = new int[256];
        Scanner in = new Scanner(System.in);
 
        System.out.print("Enter a String : ");
        str=in.nextLine();
 
         for (i = 0; i < str.length(); i++) {
            count[(int) str.charAt(i)]++;
        }
     
    for (i = 0; i < 256; i++) 
      {
       if (count[i] != 0) 
       {
      System.out.println("The character " + (char) i  + " " + count[i] + " times");
            }
        }
   }
}


// Enter a String : ashutosh
// The character a 1 times
// The character h 2 times
// The character o 1 times
// The character s 2 times
// The character t 1 times
// The character u 1 times
