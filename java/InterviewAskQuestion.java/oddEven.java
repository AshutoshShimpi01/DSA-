// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class java {
    
    public static int oddev(int n)
    {
        if(n%2==1)
        {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        
       
        
        
        int check;
        
        
        for(int i=0;i<=20;i++)
        {
            check = oddev(i);
            
            if(check==0)
            {
                System.out.print(i + " ");
            }
        }
        
        
        
       
    }
}

// 0 2 4 6 8 10 12 14 16 18 20
