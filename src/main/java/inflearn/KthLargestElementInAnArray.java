package inflearn;

import java.util.Arrays;
import java.util.Collections;

/**
 * K번째 제일큰 원소 (Kth Largest Element In An Array)
 * k번째로 큰 요소는 정렬후 값에대한 가장 큰 요소가 아닌 유일한(distinctive) 순서 요소
 *
 * 입출력
 * Input: nums = [2,3,1,5,6,4], k = 2       Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
 * Output: 5                                Output: 4
 *
 * 문제 Format                                  제한사항
 * class Solution {                            1 <= k <= nums.length <= 10(4)
 *   public int solve(int[] nums, int k) {}    -10(4) <= nums[i] <= 10(4)
 * }
 */
public class KthLargestElementInAnArray {


  public static void main(String[] args) {

    int A[] = {3,2,3,1,2,4,5,5,6};

    System.out.println(solve(A,4));

  }

  public static int solve(int[] nums, int k) {

    int maxDigit = (int) Math.pow(10,4);
    int minDigit = (int) Math.pow(10,4) * -1; // -_-...음수의 거듭제곱 연산을 이렇게 해야할까..

    if (1 <= k && k <= nums.length && nums.length <= maxDigit) {

      boolean returnFlag = false;

      for (int i : nums) {
        if (!(minDigit <= i && i <= maxDigit)) {
          returnFlag = true;
          break;
        }
      }

      if (returnFlag)
        return -1;

      //stream 객체를 이용
      int[] arrDesc = Arrays.stream(nums).boxed()
          .sorted(Collections.reverseOrder())
          .mapToInt(Integer::intValue)
          .toArray();

      return arrDesc[k-1];

    }

    return -1;


  }



}
