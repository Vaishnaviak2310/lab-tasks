package edu.neu.mgen;
import java.util.ArrayList;
import java.util.List;
public class onepart2 {
    public static void main(String[] args) {
        
        List<String> names = new ArrayList<>();
        names.add("Vaishnavi");
        names.add("Dhananjay");
        names.add("Soumya");
        names.add("Yashashri");
        names.add("Akhilesh");

        List<String> switchedNames = switchFirstAndLastLetters(names);

        System.out.println("Names = " + names);
        System.out.println("Names (switched) = " + switchedNames);
    }

    private static List<String> switchFirstAndLastLetters(List<String> names) {
        List<String> switchedNames = new ArrayList<>();
        for (String name : names) {
            String switchedName = switchFirstAndLastLetters(name);
            switchedNames.add(switchedName);
        }
        return switchedNames;
    }

    private static String switchFirstAndLastLetters(String name) {
        char firstChar = name.charAt(0);
        char lastChar = name.charAt(name.length() - 1);
        String middlePart = name.substring(1, name.length() - 1).toLowerCase();
        return Character.toUpperCase(lastChar) + middlePart + Character.toLowerCase(firstChar);
    }
}