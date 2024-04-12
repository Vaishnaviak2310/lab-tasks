package edu.neu.mgen;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Labone {
    
    public static void main(String[] args) {
        
        int[] x = {1, 2, 3, 4, 5};
        int[] y = {6, 7, 8, 9, 10};

        int[] z = new int[5];
        for (int i = 0; i < 5; i++) {
            z[i] = Math.max(x[i], y[i]);
        }

        System.out.println("Array x = " + Arrays.toString(x));
        System.out.println("Array y = " + Arrays.toString(y));
        System.out.println("Array z = x + y = " + Arrays.toString(z));

        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "David", "Emily"));

        List<String> switchedNames = new ArrayList<>();
        for (String name : names) {
            String switchedName = switchFirstAndLastLetters(name);
            switchedNames.add(switchedName);
        }

        System.out.println("\nNames = " + names);
        System.out.println("Names (switched) = " + switchedNames);
    }

    private static String switchFirstAndLastLetters(String name) {
        char firstChar = name.charAt(0);
        char lastChar = name.charAt(name.length() - 1);
        return Character.toUpperCase(lastChar) + name.substring(1, name.length() - 1) + Character.toLowerCase(firstChar);
    }
}
