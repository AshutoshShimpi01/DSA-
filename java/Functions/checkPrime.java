import java.lang.*;
import java.util.Scanner;



class java
{
    public static int isPrime(int num)
{
    int reminder =0;
    for(int i=2;i<num/2;i++)
    {
        reminder=i%num;
        if(reminder==0)
        {
            return 1;
        }
        
    }
    return 0;
}
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int check = isPrime(n);
        
        if(check == 0)
        {
            System.out.println("not prime");
        }
        else
        {
          System.out.println("prime");  
        }
        
    }

}
/*
11
prime
