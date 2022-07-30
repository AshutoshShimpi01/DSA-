// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;
class HelloWorld {
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int n1=0,n2=1;
        int nxt;
        
        for(int i=1;i<=n;i++)
        {
            nxt = n1 + n2;
            n1 = n2;
            n2 = nxt;
            System.out.println(n1);
        }
        
    }
}

/*
10

11
2
3
5
8
13
21
34
55

*/
