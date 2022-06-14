package inflearn;

/**
 * 제로 이동(Move Zeros)
 * 설명
 * - 정수 배열(nums)이 주어지면 0이 아닌 값은 상대적 순서를 유지하고
 * - nums 모든 0은 끝으로 이동하게 만드세요.
 *
 * 배열의 복사본을 만들지 않고 작업을 수행해야 함.
 *
 * 입출력
 * Input: nums = [0,3,2,0,8,5]       Input: nums = [0]
 * Output: [3,2,8,5,0,0]             Output: [0]
 *
 * 문제 Format
 * class Solution {
 *   public void solve(int[] nums) {}
 * }
 *
 * 제한사항
 * 1 <= nums.length <= 10(4)
 * -2(31승) <= nums[i] <= 2(31승) - 1
 */

//내가 푼 스타일 -ㅅ-...
public class MoveZeros {


  public static void main(String[] args) {

    int[] nums = {0,3,2,0,8,5};

    //뒤에 0을 넣는 방법

    //2.for
    //array+0 index
    int n = nums.length;  //6, index -1
    int index = 0;
    for(int i = 1; i < n; i++) {
      if(nums[i] != 0) {
        nums[index] = nums[i];
        index++;
      }
    }

    while(index < n) {
      nums[index] = 0;
      index++;
    }

//    for (int i : nums) {
//      System.out.println("i " + i);
//    }


    //앞에 0채우기 {0,0,3,2,8,5}
    int t = nums.length;
    int index2 = t - 1; //5

    for (int i = t - 1; i >= 0; i--) {
      if (nums[i] != 0) {
        nums[index2] = nums[i];
        index2--;
      }
    }

    while (index2 >= 0) {
      nums[index2] = 0;
      index2--;
    }

    for (int i : nums) {
      System.out.println("i " + i);
    }

//    solve(nums);
  }

//내가 푼 스타일 -ㅅ-...
//  public static void solve(int[] nums) {
//
//    if (1 <= nums.length && nums.length <= Math.pow(10,4)) {
//
//      StringBuilder str = new StringBuilder();
//
//      String temp = "";
//
//      for (int i = 0; i < nums.length; i++) {
//
//        if (nums[i] == 0) {
//          temp += nums[i];
//        } else {
//          str.append(nums[i]);
//        }
//
//      }
//
//      str.append(temp);
//
//      int[] digits = Stream.of(str.toString().split("")).mapToInt(Integer::parseInt).toArray();
//
//      for (int i = 0; i < digits.length; i++) {
//        System.out.println(digits[i]);
//      }
//
//    }
//
//  }
}
