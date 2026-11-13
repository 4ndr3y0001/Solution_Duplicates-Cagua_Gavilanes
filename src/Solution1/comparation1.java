package Solution1;

import java.util.Random;

public class comparation1 {

    public static void main(String[] args) {
        int[] data = new int[100];
        Random random = new Random();


        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(10) + 1;
        }


        long startTime = System.currentTimeMillis();

        int repetitions = 0;
        boolean found = false;

        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                repetitions++;

                if (data[i] == data[j]) {
                    // System.out.println("Duplicate found: The number " + data[i] + " repeats.");
                    found = true;
                }
            }
        }

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;

        System.out.println("Size: "+data.length);
        if (!found) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println("Total comparisons made: " + repetitions);
        }


        System.out.println("Execution time: " + totalTime + " ms");
    }
}