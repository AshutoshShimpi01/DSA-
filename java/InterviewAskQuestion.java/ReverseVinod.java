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
