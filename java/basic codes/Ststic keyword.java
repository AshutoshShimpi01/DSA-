/*

 No, we cannot override static methods because method overriding is based on dynamic binding at runtime and
 the static methods are bonded using static binding at compile time.
  
  
  
  Can we overload static methods? The answer is 'Yes'.
  We can have two or more static methods with the same name, but differences in input parameters.






static methods belongs to the class not an objects
  
we do not need to create objects we can call static methods directly or using class name.
  
static methods access only static data it cannot access non static sata like( instance variable eg- int x) access- static int x.
  
static methods calls only static methods and cannot call the non-static methods.
{ 
inside same class we can directly call static methods, but we call another static method from another class then we need to write class name.methodname();
}
  
static methods cannot refer to this or super keyword.









*/
