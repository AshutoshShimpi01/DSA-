// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
    
    
    int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
    
    int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
    
    int c[][] = new int[3][3];
    
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            c[i][j]=a[i][j]+b[i][j];
            
            System.out.print(c[i][j] + " ");
        }
        System.out.println();
    }
    
    }
}


// 2 4 6 
// 8 10 12 
// 14 16 18 




// input from user 


import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    
    int a[][] = new int[n][m];
    int b[][] = new int[n][m];
    
    
   for (int i = 0; i < n; i++) 
            {
                for (int j = 0; j < m; j++) 
                {
                   a[i][j] = sc.nextInt();
                   b[i][j] = sc.nextInt();
                }
                System.out.println("");
            }
    
    
    int c[][] = new int[n][n];
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
           c[i][j]=a[i][j]+b[i][j]; 
           System.out.print(c[i][j] + " ");
        }
        System.out.println();
    }
    
    
    
    }
}


// 3 3
// 1 2 3 4 5 6 7 8 9
// 3 3
// 1 2 1 2 3 4 5 5 6 

// 5 9 13 
// 17 6 3 
// 3 7 10 
