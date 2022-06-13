package inflearn;

/**
 * 플러스원
 * 설명
 * - 음이 아닌 정수를 나타내는 비어 있지 않은 십진수 배열이 주어지면 정수 1을 증가시킨다.
 * - 배열의 마지막에 숫자에 +1을 함
 * - 숫자 0 자체를 제외하고 정수에 앞에 0이 포함되지 않습니다
 *
 * 입출력
 * Input: digit = [1,2,3]
 * Output: [1,2,4]
 *
 * Input: [9,9,9]
 * Output: [1,0,0,0]
 *
 * 문제 Format
 * class Solution {
 *   public int[] solve(int[] K) {
 *
 *   }
 * }
 *
 * 제한 사항
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 */
public class PlusOne {

  public static void main(String[] args) {
//    int[] digits = {1,2,3};
    int[] digits = {9,9,9};
//    int[] digits = {9,8,9};
//    int[] digits = {8,9,9};
//    int[] digits = {0,0,1};
//    int[] digits = {0,0};
//    int[] digits = {9,0,0,9};
//    int[] digits = {9,9,9,9,9};
    int[] result = solve(digits);

    for (int i : result) {
      System.out.println("val:" + i);
    }

  }


  public static int[] solve(int[] digits) {
    int n = digits.length;

    for (int i = n - 1; i >= 0; i--) {

      //2,1,0
      digits[i]++;

      if(digits[i] < 10) {
        return digits;
      }

      digits[i] = 0;

    }

    int[] result = new int[n+1];

    result[0] = 1;

    return result;


  }

}
