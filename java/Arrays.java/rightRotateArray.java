// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        
        
        
        
        int arr[] = {1,2,3,4,5};
        
        
        int temp = arr[0];
        
         int last = arr[arr.length-1];
        
     for(int i = arr.length-1; i > 0; i--)
      {
         
         arr[i] = arr[i-1];
        
      }
        arr[0] = last;
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        

    }
}


// 5 1 2 3 4 
