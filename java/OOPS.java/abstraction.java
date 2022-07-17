// Online Java Compiler
// Use this editor to write, compile and run your Java code online


import java.util.*;

abstract class vehicle {
    
    abstract void start();
    
}

class car extends vehicle
{
    void start()
    {
        System.out.println("Car starts with key");
    }
}

class scooter extends vehicle
{
    void start()
    {
      System.out.println("Scooter starts with kick");  
    }
    
     public static void main(String[] args) {
        
        car c = new car();
        c.start();
        
        scooter s = new scooter();
        
        s.start();
      
       
    }
}

/*
Car starts with key
Scooter starts with kick
*/
