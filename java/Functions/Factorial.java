// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class java {
    
    public static int isFact(int n)
    {
        int fact=1;
        for(int i=2;i<=n;i++)
        {
           fact = fact *i;
        }
        return fact;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        java j = new java();
        
        int n = sc.nextInt();
        int check = isFact(n);
        
       
        System.out.println(check); 
       
    }
}

/*
5
120
*/
