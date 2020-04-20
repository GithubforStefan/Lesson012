package Homework.HWExercise3;


import java.util.*;

public class UniqueValuesOfString {
    public static HashSet<Character> makeHashSetOfChars(){
        HashSet<Character> uniqueCharacters = new HashSet<>();
        String notUniqueCharacters = "BlablablA";


        for (int i = 0; i<=notUniqueCharacters.length()-1;i++){
            String lowerCaseString = notUniqueCharacters.toLowerCase();
            uniqueCharacters.add(lowerCaseString.charAt(i));
        }
        System.out.println(uniqueCharacters);

    return uniqueCharacters;
    }

    public static void main(String[] args) {

        makeHashSetOfChars();
    }
}
