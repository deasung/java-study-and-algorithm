package codility.lessons;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


/**
 * This is a demo task.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 *
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 *
 * Given A = [1, 2, 3], the function should return 4.
 *
 * Given A = [−1, −3], the function should return 1.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 *
 * def solution(A):
 *     A.sort()
 *     min = 1
 *     for i in A:
 *         if i == min:
 *             min += 1
 *     return min
 */
public class MissingInteger {

  public static void main(String[] args) {

    int A[] = {1, 3, 6, 4, 1, 2};

    System.out.println(solution(A));

  }

  public static int solution(int[] A) {

    Arrays.sort(A);

    int min = 1;

    if (A == null)
      return 1;

    for (int i = 0; i < A.length; i++) {
      if (A[i] == min) {
        min += 1;
      }
    }

    return min;

  }

}
