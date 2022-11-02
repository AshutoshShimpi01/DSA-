
// Online Java Compiler
// Use this editor to write, compile and run your Java code online


import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                    System.out.print("*");
            }
            System.out.println();
        }
        
    }
}

// 4
// 5
// *****
// *****
// *****
// *****



------------------




// WITH MIDDLE SPACES


import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(i==1 || j==1 || i==n || j==m)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}

// 4
// 5
// *****
// *   *
// *   *
// *****
