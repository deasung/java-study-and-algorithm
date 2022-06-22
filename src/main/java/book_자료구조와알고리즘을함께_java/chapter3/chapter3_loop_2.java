package book_자료구조와알고리즘을함께_java.chapter3;

import java.util.Arrays;

/**
 *
 * 변경 전: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 * 변경 후: [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
 *
 */
public class chapter3_loop_2 {

    public static void main(String[] args) {
        int[] students = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("변경 전: " + Arrays.toString(students));

        int[] students2 = new int[students.length];

        for (int i = 0; i < students.length; i++) {
            students2[(students.length - 1) - i] = students[i];
        }

        System.out.println("변경 후: " + Arrays.toString(students2));


    }

}
