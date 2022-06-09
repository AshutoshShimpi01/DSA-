//BY Using getter() and Setter() Method.

import java.lang.*;
import java.util.Scanner;



class java
{
    private int empid;                      //set variable as a private for hiding internal chemicals/medicine (CAPSULE/CAR Engine)
    public void setEmpid(int empid1)        // Setter Method
    {
        empid = empid1;
    }
    public int getEmpid()                  //getter Method
    {
        return empid;
    }
    public static void main(String[] args) {
        java j=new java();

        j.setEmpid(101);
        System.out.print(j.getEmpid());
        
    }
}

//101
