// Ramesh’s basic salary is input through the keyboard. His dearness allowance is 40% of basic salary,
// and house rent allowance is 20% of basic salary. Write a program to calculate his gross salary.


import java.util.Scanner;
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        float sal = sc.nextFloat();
        
        
        double need = 0.4 * sal;
        double rent = 0.2 * sal;
        
        
       double total = sal + need + rent;
        
        System.out.println(need);
        System.out.println(rent);
        System.out.println(total);
    }
}


// 20000
// 8000.0
// 4000.0
// 32000.0
