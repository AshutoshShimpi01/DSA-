// In case of call by reference original value is changed if we made changes in the called method. 
// If we pass object in place of any primitive value, original value will be changed.
// In this example we are passing object as a value. Let's take a simple example:


//temporary value changes inside functions not parmantly changes.
//temporary changes perform inside functions, not parmantly change the original value of premitive datatype.



class HelloWorld {
    
    public static void by_value(int n1)
    {
        n1=n1+30;
        System.out.println("call-by-value: "+ n1);
    }
    
    
    public static void main(String[] args) {
        
        int num = 10;
        
        by_value(num);
        System.out.println();
        System.out.println(num);
    }
}


// call-by-value: 40
// 10
