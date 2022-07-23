// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class java {
    
    public static int palin(int n)
    {
        int temp = n;
        int rem,rev=0;
        
        while(temp!=0)
        {
            rem = temp%10;
            rev = rev*10+rem;
            temp = temp/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        java j = new java();
        
        int n = sc.nextInt();
        
        int check = palin(n);
        
        if(check==n)
        {
        System.out.println("palindrome"); 
        }
       if(check!=n)
       {
        System.out.println("not palindrome"); 
       }
    }
}

/*
12321
palindrome
*/
