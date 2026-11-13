package Solution2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class comparation2 {
    public static void main(String[] args) {

        int[] data = new int[100];
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(10) + 1;
        }


        long startTime = System.currentTimeMillis();

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicatesFound = new HashSet<>();
        int operations = 0;

        for (int number : data) {
            operations++;
            if (!seen.add(number)) {
                if (duplicatesFound.add(number)) {
                    //System.out.println("Duplicate found: The number " + number);
                }
            }
        }


        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;


        System.out.println("\nSize: "+data.length);
        System.out.println("Total operations/comparisons: " + operations);

        if (duplicatesFound.isEmpty()) {
            System.out.println("No duplicates found.");
        }

        System.out.println("Execution time: " + totalTime + " ms");
    }
}