package codility.lessons;

import java.util.Arrays;

/**
 * A non-empty array A consisting of N integers is given. Array A represents numbers on a tape.
 * <p>
 * Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
 * <p>
 * The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
 * <p>
 * In other words, it is the absolute difference between the sum of the first part and the sum of the second part.
 * <p>
 * For example, consider array A such that:
 * <p>
 * A[0] = 3 A[1] = 1 A[2] = 2 A[3] = 4 A[4] = 3 We can split this tape in four places:
 * <p>
 * P = 1, difference = |3 − 10| = 7 P = 2, difference = |4 − 9| = 5 P = 3, difference = |6 − 7| = 1 P = 4, difference = |10 − 3| = 7 Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given a non-empty array A of N integers, returns the minimal difference that can be achieved.
 * <p>
 * For example, given:
 * <p>
 * A[0] = 3 A[1] = 1 A[2] = 2 A[3] = 4 A[4] = 3 the function should return 1, as explained above.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [2..100,000]; each element of array A is an integer within the range [−1,000..1,000].
 */


public class TapeEquilibrium {


  public static void main(String[] args) {

    int a[] = {3, 1, 2, 4, 3};

    System.out.println(solution(a));

  }

  public static int solution(int[] A) {

//    int sumFromFirst = 0;
//    int sumToLast = 0;
    int totalSum = 0;

    for (int i = 0; i < A.length; i++) {
      totalSum += A[i];
    }

    System.out.println("totalSum:" + totalSum);

    int result = Integer.MAX_VALUE;
    int sum = 0;

    for (int i = 0; i < A.length - 1; i++) {

      //i까지의 합
      sum += A[i];
      //i까지의 합 - (총합 - i까지의합)과 result와 비교해서 작은 값을 result에
      int min = Math.abs(sum - (totalSum - sum));

      result = Math.min(result, min);

      System.out.format("sum:%d min:%d result:%d\n",sum,min,result);

    }

    return result;
  }

//    int sumFromFirst = 0;
//    int sumToLast = 0;
//
//    for (int i = 0; i < A.length; i++) {
//      sumFromFirst += A[i];
//    }
//
//    int minDiff = Integer.MAX_VALUE;
//
//    for (int p = 1; p < A.length; p++) {
//
//      sumFromFirst += A[p - 1];
//      sumToLast -= A[p - 1];
//
//      int diff = Math.abs(sumFromFirst - sumToLast);
//
//      if (diff < minDiff) {
//        minDiff = diff;
//      }

//    }
//    return minDiff;
}


