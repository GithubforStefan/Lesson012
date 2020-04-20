package Homework.HWExercise2;

import java.util.*;

public class ArrayOfUniqueValues {




    public int[] fillArray(){
        int i;
        int nonUniqueValues[] = new int[40];

        for (i=0;i<20;i++){
            nonUniqueValues[i] = i+1;

        }
        for (i=20;i<40;i++) {
            nonUniqueValues[i] = i - 19;
        }
        System.out.println(Arrays.toString(nonUniqueValues));
        int end = nonUniqueValues.length;
        Set<Integer> uniqueValues = new HashSet<Integer>();

        for( i = 0; i < end; i++){
            uniqueValues.add(nonUniqueValues[i]);
        }
        System.out.println(uniqueValues);



        return nonUniqueValues;
    }

    public static void main(String[] args) {
        ArrayOfUniqueValues newArray = new ArrayOfUniqueValues();
        newArray.fillArray();

    }

}
