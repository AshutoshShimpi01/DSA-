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
