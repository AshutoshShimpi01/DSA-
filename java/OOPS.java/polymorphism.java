/*

POLYMORPHISM :-

 When one name having a many forms this concept is nothing but polymorphism.
 
 example :-
  
  (1) water -  water have differsend forms solid,liquid,gas.
  (2) Shapes - shapes have different forms square,triangle,circle,rectangle.
  (3) Sound - Dog(barking), Lion(roar).
  
 types :-
  
  (1) Compile time polymorphism - also called static poly, we  can achive methodOverloading using this.
  
  (1) run time polymorphism - also called dynamic poly, we  can achive methodOverriding using this.
  

Method Overloading:-

(same name, within same class, different arguments types-(no. of argu, type of arg, sequ of arg)


We can achive Compile time polymorphism using mathodOverloading.



*/

//Dynamic Binding:-
-------------------





class A {
    public void show()
    {
        System.out.println("class a");
    }
}
class B extends A
{

/*  
public void show()
    {
        System.out.println("class b");
    }
*/    
}

class test
{
    public static void main(String[] args) {
        
        A a = new B();  //
        
        a.show();
    }
}

/*
Output-  class a

if class B not commented so output is class b.
and if any method doesnot write so we got error.

*/



--------------------------

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

byte →🔜short
short →🔜int
int →🔜 float,long,double
char →🔜 int
long→🔜 float,double
float →🔜 double

Object -is the parent class of all the classes in java
--------------------------------------------------------------------------




Method Overriding -   

(same name, within different class, same arguments types-(no. of argu, type of arg, sequ of arg)
if these all condition satistify and Inheritance is also present then only MethodOverloading present.
 
 We can achive Compile time polymorphism using mathodOverloading.
 
 
 
 Use of MethodOverriding -
 
 by using methodOverriding - we can able to change implementation according to us(what we want).
 (means we extend parent class using child class,
 and create obj of child class but call only a method of child class .)

example -


import java.util.*;

class test
{
    
   void show()
   {
       System.out.println("1");
   }
   
}

class check extends test
{
   
   void show()
   {
       System.out.println("2");
   }


    
     public static void main(String[] args) {
        
       test t = new test();
      // check c = new check();  if this 
       t.show();
      //c.check();  then output 2
    }
}

/*
1


we create which class obj so we only got inside this method output.
we cannot achive both class output using extend keyword. 
when we use super keyword so itis possiable
*/

--------------------------------------------------------------------------

<Q.2> Type of argument must be same


class test
{
    
   void show(String a)
   {
       System.out.println("1");
   }
   
}

class check extends test
{
   
   void show(String a)
   {
       System.out.println("2");
   }


    
     public static void main(String[] args) {
        
       test t = new test();
       t.show("ashu"); //  output- 1
       
      // check c = new check();  if this 
      //c.check();  then output 2
    }
}


--------------------------------------------------------------------------

<Q.3> Sequence of argument must be same

class test
{
    
   void show(String a,int b)
   {
       System.out.println("1");
   }
   
}

class check extends test
{
   
   void show(String a,int b)
   {
       System.out.println("2");
   }


    
     public static void main(String[] args) {
        
       test t = new test();
       t.show("tt",10);  //.  1
       
      
       check c = new check();  
       c.show("ss",20); //.  2
    }
}
OUTPUT- 
1
2

--------------------------------------------------------------------------

<Q.4> Do Overriding method must have same return type?

before 1.4 version it is not allowed, but after(from java 5.0) covarent return type is allowed.

eg -

class test
{
int show()  //return type int
{
sop("1");
return null
}
}

class check extends test
{
String show() //return type String
{
sop("1");
return null;
}
}

--------------------------------------------------------------------------

<Q.5>
