// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class java {
    
    
    
    public static void main(String[] args) {
        
        
        int arr[] = {1,1,2,3,2,2,4,7};
        
        int fr[] = new int[arr.length];
        
        int check=-1;
        
        
        for(int i=0;i<arr.length;i++)
        {
            int count=1;
            
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    fr[j]=check;
                }
            }
            if(fr[i]!=check)
            {
                fr[i]=count;
            }
        }
        
        System.out.println("---------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------"); 
        
        for(int i=0;i<arr.length;i++)
        {
            if(fr[i]!=check)
            {
                System.out.println(" "+ arr[i] + " " + fr[i]);
            }
            System.out.println("---------------");   
        }
        
    }
}


// ---------------
//  Element | Frequency
// ---------------
//  1 2
// ---------------
// ---------------
//  2 3
// ---------------
//  3 1
// ---------------
// ---------------
// ---------------
//  4 1
// ---------------
//  7 1
// ---------------
