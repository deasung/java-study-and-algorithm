package leetcode;


import java.util.HashSet;
import java.util.Set;

/**
 * Given a string s, find the length of the longest
 * substring
 *  without repeating characters.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
class Solution {

  public static void main(String[] args) {
    String s = "pwwkew";
    int longestLength = findLongestSubstringLength(s);
    System.out.println("The length of the longest substring without repeating characters: " + longestLength);
  }

  public static int findLongestSubstringLength(String s) {
    Set<Character> seen = new HashSet<>();
    int maxLength = 0, left = 0;

    for (int right = 0; right < s.length(); right++) {
      while (seen.contains(s.charAt(right))) {
        seen.remove(s.charAt(left++));
      }
      seen.add(s.charAt(right));
      maxLength = Math.max(maxLength, right - left + 1);
    }

    return maxLength;
  }
}