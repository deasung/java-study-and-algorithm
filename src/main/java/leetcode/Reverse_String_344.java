package leetcode;

/**
 * Example 1:
 *
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 * Example 2:
 *
 * Input: s = ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 */

public class Reverse_String_344 {


  public static void main(String[] args) {

    char[] s = {'h', 'e', 'l', 'l', 'o'};

    // 배열을 반대로 뒤집기
    reverseArray(s);

    // 결과 출력
    for (char str : s) {
      System.out.print(str);
    }


  }

  public static void reverseArray(char[] array) {
    int left = 0;
    int right = array.length - 1;

    while (left < right) {
      // 앞쪽과 뒤쪽 요소를 교환
      char temp = array[left];
      array[left] = array[right];
      array[right] = temp;

      // 포인터 이동
      left++;
      right--;
    }
  }
}
