package Exercise7;

import com.sun.source.tree.*;

import java.util.*;

public class DescendingTreeSet {
    public static TreeSet<Integer> descNumbers = new TreeSet<Integer>();

    public static TreeSet numbersdesc(){
        int i = 1;
        for (i=1;i<=20;i++) {
            descNumbers.add(i);

        }
        System.out.println(descNumbers.descendingSet());
        return descNumbers;
    }

    public static void main(String[] args) {
        numbersdesc();
    }

}
