package Exercise4;

import java.util.HashSet;
public class Intersections {
    public static HashSet<String> sweetFruits;
    public static HashSet<String> sourFruits;


    public static HashSet<String> intersection(HashSet<String> sweetFruits, HashSet<String> sourFruits) {

        sweetFruits.retainAll(sourFruits);

        return sweetFruits;

    }




    public static void main(String[] args) {

        sweetFruits = new HashSet<>();
        sourFruits = new HashSet<>();

        sweetFruits.add("strawberry");
        sweetFruits.add("cherry");
        sweetFruits.add("orange");
        System.out.println(sweetFruits);

        sourFruits.add("lemon");
        sourFruits.add("lime");
        sourFruits.add("orange");
        System.out.println(sourFruits);



        System.out.println(intersection(sweetFruits,sourFruits));



    }

}
