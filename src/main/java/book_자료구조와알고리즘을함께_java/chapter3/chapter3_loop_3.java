package book_자료구조와알고리즘을함께_java.chapter3;

import java.util.Random;

public class chapter3_loop_3 {

    public static void main(String[] args) {
        Random random = new Random();

        final int ARRAY_LENGTH = 100;

        int[] arr = new int[ARRAY_LENGTH];
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            arr[i] = random.nextInt(100);
        }

        int min = 0;
        int max = 0;

        for (int k : arr) {
            if (min > k) {
                min = k;
            } else if (max < k) {
                max = k;
            }
        }

        System.out.println("최솟값: " + min);
        System.out.println("최댓값: " + max);
    }

}
