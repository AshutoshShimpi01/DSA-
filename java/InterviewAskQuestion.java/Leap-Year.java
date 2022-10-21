// Online Java Compiler
// Use this editor to write, compile and run your Java code online


import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        
        if(n%4==0)
        {
            
            
            if(n%100==0)
            {
                 if(n%400==0)
                 {
                     System.out.print("leap Y");
                 }
                 
                 else
                {
                System.out.print("not leap Year");
                }
                
            }
            
            else
            {
                System.out.print("leap Year");
            }
            
        }
            else
            {
                System.out.print("not leap Year");
            }
            
    }
}
// 2016
// leap Year
