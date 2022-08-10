class Calc
{
int num1;  // which ever veriables are declare inside class not inside method parameters these are instance veriable.
int num2; // instance veriable.
int result; // instance veriable.

public Calc(int num1,int num2) // local veriables
{
	this.num1=num1;       // here we use this key word coz local and instance variable names are same. 
	                      //if we not write this key then we cant able to asign value to our instance variable and we got 0 output. coz num1=num1 ?
	this.num2=num2;      // this. num1 and this.num2 reffers to the current class instance num1 and num2 variables.
	
}

}

public class ja
{

 public static void main(String[] args) 
     {
	
		Calc obj = new Calc(7,5);
		System.out.println(obj.num1);
		System.out.println(obj.num2);
	
     }
}	


/*
OUTPUT-

7,5 // if you not use This key so output is 0,0

*/

*************------------------------*************

class Employee
{

String name;
int emp_id;

Employee(String name,int emp_id)
{
  this.name=name;
  this.emp_id=emp_id;

}

public static void main(String[] args) {
  Employee e1=new Employee("Omkar",101);
  Employee e2=new Employee("Dhiraj",103);
  System.out.println("Employee 1 : "+e1.name+" "+e1.emp_id);
  System.out.println("Employee 2 : "+e2.name+" "+e2.emp_id);
}

}

/*

Employee 1 : Omkar 101
Employee 2 : Dhiraj 103


*/
