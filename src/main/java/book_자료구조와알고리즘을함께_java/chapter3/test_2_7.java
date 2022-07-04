package book_자료구조와알고리즘을함께_java.chapter3;

import java.util.Arrays;
import java.util.Scanner;

public class test_2_7 {


    public static void main(String[] args) {

        test_2_7 test_2_7 = new test_2_7();


//        test_2_7.Practice02_1();

//        test_2_7.Practice02_2();

        test_2_7.Practice02_3();
    }

    /**
     *
     */
    private void Practice02_1() {

        int[] arr = new int[5];
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {

            int temp = scanner.nextInt();
            arr[i] = temp;
            sum += temp;

        }

        System.out.println(sum);

    }


    /**
     * 배열의 최댓값과 최솟값을 구하는 메서드 작성
     */
    private void Practice02_2() {
        int[] arr = {10,11,2,5,3,3,24,15,6,9};

        Arrays.sort(arr);

        int min = arr[0];

        int max = arr[arr.length - 1];

        System.out.format("%d %d\n",min,max);

    }

    /**
     * 순서가 없는 두 배열에서 서로 같은 요소를 포함하는지 판별하는 메서드 작성
     * 예) A 배열[1,3,2], 배열[2,3,1]은 같은 배열이다.
     */
    private void Practice02_3() {

        int[] arr1 = {1,3,2};
        int[] arr2 = {2,3,1};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr1,arr2));

    }


    private void Practice02_4() {

    }



}
