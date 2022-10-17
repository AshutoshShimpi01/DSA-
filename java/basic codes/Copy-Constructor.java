// Online Java Compiler
// Use this editor to write, compile and run your Java code online


//WHEN WE PASS OBJECT REFERENCE TO THE CONSTRUCTOR


// (it will copy the value of one object to another object of a class)

class A {
    
    int x,y;
    
    A()
    {
        x=10;
        y=11;
        
        System.out.println(x + " " + y);
    }
    
    A(A ref)
    {
        x=ref.x;
        y=ref.y;
        
        System.out.println(x + " " + y);
    }
    
}

class C
{
    
    public static void main(String[] args) {
        
        A r = new A();
        A r2 = new A(r);
        
        
    }
}

// 10 11
// 10 11
