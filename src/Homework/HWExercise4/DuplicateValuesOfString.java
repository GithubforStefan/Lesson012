package Homework.HWExercise4;

import java.lang.reflect.*;
import java.util.*;

public class DuplicateValuesOfString {
    public static String returnDuplicateCharacters(){
        HashSet<Character> duplicateCharacters = new HashSet<>();
        String stringWithDuplicateCharacters = "ReDi School is cool";
        String lowerCaseString = stringWithDuplicateCharacters.toLowerCase();


        for (int i = 0; i<=stringWithDuplicateCharacters.length()-1;i++){
            //String lowerCaseString = stringWithDuplicateCharacters.toLowerCase();
            //System.out.println(lowerCaseString);
            lowerCaseString = lowerCaseString + stringWithDuplicateCharacters.charAt(i);
        }
        System.out.println(lowerCaseString);

        return lowerCaseString;
    }

    public static void main(String[] args) {

        returnDuplicateCharacters();
    }

     /*
    public static void main(String argu[]) {

        char[] duplicateCharacters = new char[0];
        String str = "ReDi school is cool";
        int cnt = 0;
        char[] inp = str.toCharArray();
        System.out.println("Duplicate Characters are:");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (inp[i] == inp[j]) {
                    duplicateCharacters[i]= inp[j];
                    cnt++;
                    break;
                }
            }
        }
    }*/
}
