package Homework.HWExercise1;

import java.util.*;

public class SymmetricDifference {
    public static HashSet<String> sweetFruits;
    public static HashSet<String> sourFruits;
    public static HashSet<String> differenceOfFruits;


    public static HashSet<String> difference(HashSet<String> sweetFruits, HashSet<String> sourFruits) {

        HashSet<String> diff = new HashSet<>(sweetFruits);
        diff.addAll(sourFruits);

        HashSet<String> tmp = new HashSet<String>(sweetFruits);
        tmp.retainAll(sourFruits);
        diff.removeAll(tmp);



        return diff;

    }




    public static void main(String[] args) {

        sweetFruits = new HashSet<>();
        sourFruits = new HashSet<>();
        differenceOfFruits = new HashSet<>();

        sweetFruits.add("strawberry");
        sweetFruits.add("cherry");
        sweetFruits.add("orange");
        //System.out.println(sweetFruits);

        sourFruits.add("lemon");
        sourFruits.add("lime");
        sourFruits.add("orange");
        //System.out.println(sourFruits);



        System.out.println(difference(sweetFruits,sourFruits));



    }

}
