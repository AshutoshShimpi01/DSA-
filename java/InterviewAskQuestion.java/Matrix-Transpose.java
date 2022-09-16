// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        
        
            int arr[][] = {{1,2,3},{3,4,5},{6,7,8}};
            
            
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    System.out.print(arr[i][j]);
                }
                System.out.println(" ");
            }
            
            System.out.println(" ");
            System.out.println("Transpose M");
            System.out.println(" ");
        
        for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                     System.out.print(arr[j][i]);
                }
                System.out.println(" ");
            }
       
    }
}


// 123 
// 345 
// 678 
 
// Transpose M
 
// 136 
// 247 
// 358 
