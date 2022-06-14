package codility.lessons.prefix_sums;

/**
 * A non-empty array A consisting of N integers is given. The consecutive elements of array A represent consecutive cars on a road.(배열 A의 연속 요소는 도로의 연속 자동차를 나타냅니다)
 *
 * Array A contains only 0s and/or 1s:
 *
 * 0 represents a car traveling east, (0은 동쪽)
 * 1 represents a car traveling west. (1은 서쪽)
 * The goal is to count passing cars. We say that a pair of cars (P, Q), where 0 ≤ P < Q < N, is passing when P is traveling to the east and Q is traveling to the west.(P가 동쪽으로 여행하고 Q가 서쪽으로 여행할 때)
 *
 * For example, consider array A such that:
 *   0 <= P < Q < N
 *   A[0] = 0
 *   A[1] = 1
 *   A[2] = 0
 *   A[3] = 1
 *   A[4] = 1
 *
 *
 * We have five pairs of passing cars: (0, 1), (0, 3), (0, 4), (2, 3), (2, 4).
 *
 * (0, 1) = a[0],a[1]   (0, 3) = a[0],a[3]   (0, 4) = a[0],a[4] , (2, 3) = a[2],a[3] , (2, 4) = a[2][4]
 *
 *
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given a non-empty array A of N integers, returns the number of pairs of passing cars.
 *
 * The function should return −1 if the number of pairs of passing cars exceeds 1,000,000,000.
 *
 * For example, given:
 *
 *   A[0] = 0
 *   A[1] = 1
 *   A[2] = 0
 *   A[3] = 1
 *   A[4] = 1
 * the function should return 5, as explained above.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer that can have one of the following values: 0, 1.
 */
public class PassingCars {


  public static void main(String[] args) {

    int A[] = {0,1,0,1,1}; // return 5

    System.out.println(solution(A));

  }
  // P = 0, Q = 1
  //0 <= P < Q < N
  //(0, 1) = a[0],a[1]   (0, 3) = a[0],a[3]   (0, 4) = a[0],a[4] , (2, 3) = a[2],a[3] , (2, 4) = a[2][4]
  public static int solution(int[] A) {

    int N = A.length;

    int result = 0;

    if (N >= 1 && N <= 100000) {

      for (int i = 0; i < N; i++) {

        if (A[i] == 0) {

          for (int j = i + 1; j < N; j++) {

            if (A[j] == 1) {
              result++;
            }

          }
        }
      }

    }


    return result;
  }

}
