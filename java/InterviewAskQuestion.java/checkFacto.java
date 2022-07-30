// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;
class HelloWorld {
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        
        int fact = 1;
        
        for(int i=1;i<=n;i++)
        {
            fact *= i;
        }
        System.out.print(fact);
        
    }
}

/*
5
120
*/
