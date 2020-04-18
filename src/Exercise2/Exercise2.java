package Exercise2;

import java.util.*;

public class Exercise2 {

    //Exercise 2
    public static TreeSet<Integer> randomSet(int n, int max) {
        TreeSet<Integer> randomNumbers = new TreeSet<>();
        Random random = new Random(2);
        while (randomNumbers.size() < n) {
            int randomNumber = random.nextInt(max);
            randomNumbers.add(randomNumber);
        }
        return randomNumbers;
    }
   /* Exercise 2
    Write a static method randomSet that will return a HashSet containing a collection of n unique random numbers in
    range 0-100. In the main method iterate over the returned Set and print each number multiplied by 2.
    Where n is a number of random elements in set.
          */
}
