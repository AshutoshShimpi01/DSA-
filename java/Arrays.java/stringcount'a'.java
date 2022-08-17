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
