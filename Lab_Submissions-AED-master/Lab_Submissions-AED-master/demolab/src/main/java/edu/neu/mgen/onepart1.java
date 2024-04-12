package edu.neu.mgen;
import java.util.Arrays;
public class onepart1 {
    
    public static void main(String[] args) {
        // Initialize arrays x and y
        int[] x = {1, 2, 3, 4, 5};
        int[] y = {6, 7, 8, 9, 10};

        // Create array z containing max of x and y elements
        int[] z = new int[5];
        for (int i = 0; i < 5; i++) {
            z[i] = Math.max(x[i], y[i]);
        }

        // Print arrays x, y, and z
        System.out.println("Array x = " + Arrays.toString(x));
        System.out.println("Array y = " + Arrays.toString(y));
        System.out.println("Array z = x + y = " + Arrays.toString(z));
    }
}