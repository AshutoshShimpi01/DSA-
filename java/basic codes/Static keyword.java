/*

 No, we cannot override static methods because method overriding is based on dynamic binding at runtime and
 the static methods are bonded using static binding at compile time.
  
  
  
  Can we overload static methods? The answer is 'Yes'.
  Can we overload the methods by making them static?
  No, We cannot overload the methods by just applying the static keyword to them(number of parameters and types are the same).

  We can have two or more static methods with the same name, but differences in input parameters.
  
  


STATIC VARIABLE BASICALLY USED FOR MEMORY MANAGEMENT. (occupie spase under method area or class area)



static methods belongs to the class not an objects
  
we do not need to create objects we can call static methods directly or using class name.
  
static methods access only static data it cannot access non static sata like( instance variable eg- int x) access- static int x.
  
static methods calls only static methods and cannot call the non-static methods.
{ 
inside same class we can directly call static methods, but we call another static method from another class then we need to write class name.methodname();
}
  
static methods cannot refer to this or super keyword.









*/
