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
 
        int counter[] = new int[256];
        Scanner in = new Scanner(System.in);
 
        System.out.print("Enter a String : ");
        str=in.nextLine();
 
         for (i = 0; i < str.length(); i++) {
            counter[(int) str.charAt(i)]++;
        }
        // Print Frequency of characters
for (i = 0; i < 256; i++) {
if (counter[i] != 0) {
System.out.println("The character " + (char) i  + " has occurred for " + counter[i] + " times");
            }
        }
   }
}


// Enter a String : ashutosh sanjay shimpi
// The character   has occurred for 2 timesThe character a has occurred for 3 times
// The character h has occurred for 3 times
// The character i has occurred for 2 times
// The character j has occurred for 1 times
// The character m has occurred for 1 times
// The character n has occurred for 1 times
// The character o has occurred for 1 times
// The character p has occurred for 1 times
// The character s has occurred for 4 times
// The character t has occurred for 1 times
// The character u has occurred for 1 times
// The character y has occurred for 1 times
