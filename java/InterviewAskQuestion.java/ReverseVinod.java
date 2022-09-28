// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        
        String s = "vinod";
        
        String str = "";
        
        for(int i=s.length()-1;i>=0;i--)
        {
            str += String.valueOf(s.charAt(i));
        }
        System.out.println(str);
    }
}

//doniv




---------------
 //PALINDROMIC STRING
 
    
 // Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        String s = "nayan";
        
        String str = "";
        
        for(int i=s.length()-1;i>=0;i--)
        {
            str+=String.valueOf(s.charAt(i));
        }
        System.out.println(str);
        System.out.println(" ");
        
      System.out.println(s.compareTo(str));
      
   
    }
}

// nayan
// 0

// doniv
// 18




 //     if(s==str)
    //     {
    //         System.out.println(" palindrome ");
    //     }
    //   else
    //     {
    //         System.out.println(" not palindrome ");
    //     }




--------------
    
    
 // Online Java Compiler
// Use this editor to write, compile and run your Java code online

class java {
    public static void main(String[] args) {
      String s = "i am ashu aat akait aakau jay. asakjh ajhga sman aaj";


      String[] arr = s.split(" ");

      for(int i = 0; i < arr.length; i++) {
        if(arr[i].charAt(0) == 'a') {
          System.out.println(arr[i]);
        }
      }
    }
}

// am
// ashu
// aat
// akait
// aakau
// asakjh
// ajhga
// aaj


--------------------------
    
 // Online Java Compiler
// Use this editor to write, compile and run your Java code online

class java {
    public static void main(String[] args) {
      String s = "i am ashu aat akait aakau jay. asakjh ajhga sman aaj";


      String[] arr = s.split(" ");

      for(int i = 0; i < arr.length; i++) {
        if(arr[i].startsWith("a")) {
          System.out.println(arr[i]);
        }
      }
    }
}

// am
// ashu
// aat
// akait
// aakau
// asakjh
// ajhga
// aaj

-----------------------
    
 // Online Java Compiler
// Use this editor to write, compile and run your Java code online

class java {
    public static void main(String[] args) {
      String s = "i am ashu aat akait aakau jay. asakjh ajhga sman aaj";


      String arr[] = s.split(" ");

      for(int i=0;i<arr.length;i++)
      {

      if(arr[i].endsWith("a"))


      {
          System.out.println(arr[i]);
        }
      }
    }
}

// am
// ashu
// aat
// akait
// aakau
// asakjh
// ajhga
// aaj

//SAME

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld 
{
    public static void main(String[] args) 
    {
        
        String s = "vinod a ass a sas aada da da";
        
        String[] arr = s.split(" ");
        
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i].charAt(0)=='a')
           {  
               
            System.out.println(arr[i]);
            
            
           }     
        }
        
       
    }
}
