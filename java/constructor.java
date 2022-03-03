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



*********************-----------------***********************




class Calc
{
int num1;
int num2;
int result;

public Calc()
{
	num1=5;
	num2=5;
	System.out.println("in Constructor");
}
public Calc(int n)
{
	num1=n;
	num2=n;
}
}

public class ja
{

 public static void main(String[] args) 
     {
	
		Calc obj = new Calc(7);
		System.out.println(obj.num1);
	
     }
}	


/*
OUTPUT-

7

*/
