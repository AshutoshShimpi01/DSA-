

class HelloWorld {
    
    public static void by_value(int n1)
    {
        n1=30;
        System.out.println("call-by-value: "+ n1);
    }
    
    
    public static void main(String[] args) {
        
        int num = 10;
        
        by_value(num);
        System.out.println(num);
    }
}


// call-by-value: 30
// 10
