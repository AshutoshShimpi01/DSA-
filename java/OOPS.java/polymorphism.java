/*

Method Overloading:-

<Q.1> Ans we cannot achive metedOverloading by changing the return type of method only. coz of ambiguity(compiler confused)

class
{

void show(int a)
{
Syso("1")
}

String show(int a)
{
Syso("2")
}

main{}

}

❌Error❌

--------------------------------------------------------------------------
<Q.2> can we overload java main class?
ans- Yes,  we can overload main method.  coz JVM always calls main method.

class test{

psvm(String[] args){
syso("1");
test t = new test();
t.main(20);

public static void main(int a){
syso("2");
}

Compile and run- output 1& 2


--------------------------------------------------------------------------

<Q.3> we can call sameName methods by using different datatypes & Arguments.



import java.util.*;

class test {
    
   void show(int a)
   {
       System.out.println("int method");
   }
   
   void show(String a)
   {
       System.out.println("String method");
   }


    
     public static void main(String[] args) {
        
       test t = new test();
       
       t.show(2);
    }
}
output-
int method

if t.show("i am good");  output= String method.

--------------------------------------------------------------------------

<Q.4> Automatic Promotion-
      
      One type is promoted to another implicitly if no matching dataType is found

class test {
    
   void show(int a)
   {
       System.out.println("int method");
   }
   
   void show(String a)
   {
       System.out.println("String method");
   }


    
     public static void main(String[] args) {
        
       test t = new test();
       
       t.show('a');   //   'a' = char bt char is not declare 
    }
}
--------------------------------------------------------------------------


