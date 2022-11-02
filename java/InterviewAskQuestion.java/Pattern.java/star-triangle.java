// Online Java Compiler
// Use this editor to write, compile and run your Java code online


import java.util.Scanner;
class code {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                    System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                    System.out.print(" *"); // space imp
            }
            System.out.println();
        }
        
    }
}

// 5
//       *
//      * *
//     * * *
//    * * * *
//   * * * * *

-----------------
    
// 2nd Approch
    
// Online Java Compiler
// Use this editor to write, compile and run your Java code online


import java.util.Scanner;
class code{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=1;j--)
            {
                    
          
            if(j>i)
            {
                System.out.print(" ");
            }
            else
            {
                System.out.print(" *");
            }
            
            }
            
            System.out.println();
            
        }
        
    }
}

// 5
//      *
//     * *
//    * * *
//   * * * *
//  * * * * *
