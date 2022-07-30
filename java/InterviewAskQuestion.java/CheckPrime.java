// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;
class HelloWorld {
    
    public static int isPrime(int n)
    {
        int reminder = 0;
        
        for(int i=2;i<n/2;i++)
        {
            reminder = n%i;
            
            if(reminder == 0)
            {
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int check = isPrime(n);
        
        if(check == 1)
        {
            System.out.println("not prime");
        }
        
        if(check != 1)
        {
            System.out.println("prime");
        }
        
        
        
        
    }
}

/*
9
not prime
*/
