// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;
class HelloWorld {
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
       String str = "ashutosh Sanjay Shimpi";
       
       int withSpaces = str.length();  
       
       System.out.println("In the string: " + "'" + str + "'");  
   
       str = str.replace(" ", "");  
       int withoutSpaces = str.length();  
       
       int noOfSpaces = withSpaces - withoutSpaces;  
       
       System.out.print("number of spaces: " + noOfSpaces);  
           
        
    }
}

/*
In the string: 'ashutosh Sanjay Shimpi'
number of spaces: 2
*/
