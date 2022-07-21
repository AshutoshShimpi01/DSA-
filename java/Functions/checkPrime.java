import java.util.Scanner;
class java {
    
    public static int isPrime(int n)
    {
        int rem=0;
        for(int i=2;i<n/2;i++)
        {
            rem = n%i;
            if(rem==0)
            {
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        java j = new java();
        
        int n = sc.nextInt();
        int check = isPrime(n);
        
       if(check==1)
       {
        System.out.println("not prime"); 
       }
       if(check==0)
       {
        System.out.println("prime"); 
       }
    }
}
