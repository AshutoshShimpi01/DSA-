// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
      int arr[] = {1,2,1,2,3,4,5,5};
      
      
      for(int i=0;i<arr.length;i++)
    {
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]==arr[j])
            {
                System.out.println(arr[j]);
            }
        }
    }
    }
}


// 1
// 2
// 5
