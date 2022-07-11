

import java.util.*;
import java.util.Scanner;

public class java{
    public static void fibo(int num)
    {
        int n1=0,n2=1,nxt;
        for(int i=1;i<=num;i++)
        {
            System.out.println(n1);
            nxt=n1+n2;
            n1=n2;
            n2=nxt;
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
5
0
1
1
2
3

