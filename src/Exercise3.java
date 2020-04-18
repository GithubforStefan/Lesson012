import java.util.*;
public class Exercise3 {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");
        System.out.println(fruits);
        /*for (Iterator<String>iterator=fruits.iterator();iterator.hasNext();){
            System.out.println(iterator.next());
            */
         for (String item :fruits){
             System.out.println(item);
        }
    }



    }//Main

