// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        
        
        int arr[] = {2,3,1,4,5};
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
            if(arr[i]>arr[j])
            {
                int temp = arr[i];
                arr[i] = arr[j];  
                arr[j] = temp;  
            }
            }
             System.out.print(arr[i] + " ");
        }
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.print(arr[i] + " ");
        // }
    }
}


//1 2 3 4 5 
