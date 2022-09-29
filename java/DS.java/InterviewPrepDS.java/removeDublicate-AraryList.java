import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

class Main {
  public static void main(String[] args) {

    // create an arraylist from the array
    // using asList() method of the Arrays class
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1, 3));
    System.out.println("ArrayList with duplicate elements: " + numbers);

    // convert the arraylist into a set
    Set<Integer> set = new LinkedHashSet<>();
    set.addAll(numbers);

    // delete al elements of arraylist
    numbers.clear();

    // add element from set to arraylist
    numbers.addAll(set);
    System.out.println("ArrayList without duplicate elements: " + numbers);
  }
}

// ArrayList with duplicate elements: [1, 2, 3, 4, 1, 3]
// ArrayList without duplicate elements: [1, 2, 3, 4]

// In the above example, we have created an arraylist named numbers. The arraylist contains duplicate elements.

// Here, we have used the Stream class to remove duplicate elements from the arraylist.

// numbers.stream() - create a stream from the arraylist
// stream.distinct() - removes duplicate elements
// stream.collect(Collectors.toList()) - returns a list from the stream
// Here, we have used typecasting to convert the returned list into an arraylist.





// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
class HelloWorld {
    public static void main(String[] args) {
        
        
        ArrayList<Integer> numb = new ArrayList<>(Arrays.asList(1,2,3,2));
        
        
        
        Set<Integer> set = new LinkedHashSet<>();
        
        set.addAll(numb);
        
        numb.clear();
        
        numb.addAll(set);
        
        System.out.print(numb + " ");
    }
}



//USING FOR LOOP



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pract{

    public static void main(String[] args) {

        int[] arr = {1,1,2,3,2,7};

        List<Integer> li = new ArrayList<>();

        Arrays.sort(arr);

        for(int i = 0; i < arr.length-1; i++) {

            if(arr[i] != arr[i+1]) {
                li.add(arr[i]);
            }
        }

        li.add(arr[arr.length-1]);

        System.out.println(li);

    }
}

// [1, 2, 3, 7]























import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class pract{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int[] arr = new int[n];
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        List<Integer> li = new ArrayList<>();

        Arrays.sort(arr);

        for(int i = 0; i < arr.length-1; i++) {

            if(arr[i] != arr[i+1]) {
                li.add(arr[i]);
            }
        }

        li.add(arr[arr.length-1]);

        System.out.println(li);

    }
}

// [1, 2, 3, 7]
