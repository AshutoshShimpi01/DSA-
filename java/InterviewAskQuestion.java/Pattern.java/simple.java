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
                System.out.print(j);
            }    
            System.out.println();
        }
        
        
    }
}

/*
3
1
12
123

*/

------------------
    
    
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
                System.out.print(j);
            }    
            System.out.println();
        }
        
        for(int i=n-1;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
}

/*
3
1
12
123
12
1

*/

