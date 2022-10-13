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
        int bit = n&1;
        
        ans += (bit * Math.pow(10,i) );  // Formula = Bit*10powi+ans
        
        n = n>>1;  //Rigth shift mean we divide no. by 2.
        i++;
    }
    System.out.print(ans);

        
        
        
    }
}

// 20
// 10100
