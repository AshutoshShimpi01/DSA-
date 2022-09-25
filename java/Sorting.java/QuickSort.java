
//MISTAKE


// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    
    public static int partition(int arr[],int low,int high )
    {
        int pivot = arr[high];
        int i = low-1;
        
        for(int j=low;j<high-1;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                //swap
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }
    
     public static void QuickS(int arr[],int low,int high )
     {
         if(low < high)
         {
             int pidx = partition(arr,low,high);
             
             QuickS(arr,low,pidx-1);
             QuickS(arr,pidx+1,high);
             
         }
     }
    
    
    public static void main(String[] args) {
        
        int arr[] = {2,1,6,3,0,9,7};
        
        int n = arr.length;
        
        QuickS(arr,0,n-1);
        
        for(int i=0;i<n;i++)
        {
        System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

// 0 1 2 6 3 7 9 
