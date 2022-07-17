import java.util.*;
import java.util.Scanner;

public class java{
    public static void fibo(int num)
    {
        int n1=0,n2=1,nxt;
        for(int i=0;i<=num;i++)
        {
            
            nxt=n1+n2;
            n1=n2;
            n2=nxt;
            System.out.print(n1 + " ");
            
        }
        return;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        fibo(n);
        
    }
}
/*
10
1 1 2 3 5 8 13 21 34 55 89 
*/
