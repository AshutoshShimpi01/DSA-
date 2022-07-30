// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;
class HelloWorld {
    
    public static int palin(int n)
    {
       int temp = n;
       int rev = 0,rem;
       
       while(temp!=0)
       {
           rem = temp%10;
           rev = rev*10+rem;
           temp = temp/10;
       }
       
       if(n==rev)
       {
           return 1;
       }
       return 0;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int check = palin(n);
        
        if(check == 1)
        {
            System.out.println("palindrome");
        }
        
        if(check == 0) 
        {
            System.out.println(" not palindrome");
        }
        
        
        
        
        
        
    }
}

/*
12211
not palindrome
*/
