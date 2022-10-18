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



--------------
    
//WITH PARAMETER
    
    
class Student6{  
    int id;  
    String name;  
    //constructor to initialize integer and string  
    Student6(int i,String n){  
    id = i;  
    name = n;  
    }  
    //constructor to initialize another object  
    Student6(Student6 s){  
    id = s.id;  
    name =s.name;  
    }  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    Student6 s1 = new Student6(111,"Karan");  
    Student6 s2 = new Student6(s1);  
    s1.display();  
    s2.display();  
   }  
}  

// 111 Karan
// 111 Karan
