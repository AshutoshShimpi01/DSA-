// Online Java Compiler
// Use this editor to write, compile and run your Java code online


import java.util.Scanner;
import java.util.*;

class code {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
    int n = sc.nextInt();
    
    
    int i=0,ans=0;
    
    while(n!=0)
    {
        int digit = n%10;
        
        if(digit==1)
        {
        ans += Math.pow(2,i);
        }
        n = n/10;  // 101/10=10  then  n=10
        i++;
    }
    System.out.print(ans);

        
        
        
    }
}

//20
