package Exercise1;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;



import java.util.*;

import static Exercise2.Exercise2.randomSet;

public class Main {
    public static void main(String[] args) {
        //Exercise 1
        HashSet<String> fruit = new HashSet<>();
        fruit.add("banana");
        fruit.add("apple");
        fruit.add("orange");
        //  for (Iterator<String> iterator = fruit.iterator(); iterator.hasNext(); ) {
        //     System.out.println(iterator.next());
        //  }
        for (String item : fruit) {
            System.out.println(item);
        }
        fruit.clear();
        fruit.add("grapes");
        System.out.println(fruit);
        //set empty
        if (!fruit.isEmpty()) {
            System.out.println("I am not empty!");
        }

    TreeSet<Integer> randomNumbers = randomSet(10, 100);
        for (int item : randomNumbers) {
            System.out.println(item * 2);
        }



    }
}
