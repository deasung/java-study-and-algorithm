package codility.lessons.prefix_sums;

/**
 * Write a function:
 * <p>
 * class Solution { public int solution(int A, int B, int K); }
 * <p>
 * that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:
 * <p>
 * { i : A ≤ i ≤ B, i mod K = 0 }
 * <p>
 * For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * A and B are integers within the range [0..2,000,000,000]; K is an integer within the range [1..2,000,000,000]; A ≤ B.
 * <p>
 * 해석 세 개의 정수 A, B, K가 주어지면 [A..B] 범위 내에서 K로 나눌 수 있는 정수의 개수를 반환합니다. 즉:
 * <p>
 * { i : A ≤ i ≤ B, i  mod  K = 0 }
 * <p>
 * 예를 들어, A = 6, B = 11 및 K = 2의 경우 함수는 3을 반환해야 합니다. [6..11] 범위 내에서 2로 나눌 수 있는 3개의 숫자, 즉 6, 8 및 10이 있기 때문입니다.
 * <p>
 * 다음 가정에 대한 효율적인 알고리즘을 작성 하십시오.
 */
public class CountDiv {

  public static void main(String[] args) {

    System.out.println(solution(6, 11, 2));

  }

//  public static int solution(int A, int B, int K) {
//
//    int result = 0;
//
//    if ((A >= 0 && A <= 2000000000) && (B >= 0 && B <= 2000000000)
//        && (K >= 1 && K <= 2000000000) && (A <= B)
//    ) {
//
//      for (int i = A; i <= B; i++) {
//
//        if (i % K == 0) {
//          result++;
//        }
//
//
//      }
//
//    }
//
//    return result;
//
//  }


  public static int solution(int A, int B, int K) {
    int init = 0;
    for (int i = A; i <= B; i++) {
      if (i % K == 0) {
        init = i;
        break;
      }
    }

    if (A == B) {
      return A % K == 0 ? 1 : 0;
    }

//    int temp1 = B / K;
//    int temp2 = B / K - init;
//    int temp3 = B / K - init / K;
//    int temp4 = B / K - init / K + 1;

    int result = B / K - init / K + 1;
    return result;
  }

}
