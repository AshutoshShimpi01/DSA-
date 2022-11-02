// Online Java Compiler
// Use this editor to write, compile and run your Java code online


import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                    System.out.print("*");
            }
            System.out.println();
        }
        
    }
}

// 5
// *
// **
// ***
// ****
// *****

-------------
    
// Online Java Compiler
// Use this editor to write, compile and run your Java code online


import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                    System.out.print("*");
            }
            System.out.println();
        }
        
    }
}

// 5
// *****
// ****
// ***
// **
// *

--------------
