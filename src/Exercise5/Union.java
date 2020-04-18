package Exercise5;
import java.util.HashSet;
public class Union {
    public static HashSet<String> sweetFruits;
    public static HashSet<String> sourFruits;


    public static HashSet<String> union(HashSet<String> sweetFruits, HashSet<String> sourFruits) {

        sweetFruits.addAll(sourFruits);

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



        System.out.println(union(sweetFruits,sourFruits));



    }

}
