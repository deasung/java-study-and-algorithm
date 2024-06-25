package inflearn.자바_알고리즘_문제풀이_코테대비.투포인터;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 최대_매출 {


//  public int soltuion(int n, int k, int[] a) {
//
//    int p1 = 0, p2 = 0;
//
//    ArrayList<Integer> answer = new ArrayList<>();
//
//    int sum = 0;
//
//    while (answer.size() != (n - k) + 1) {
//
////      System.out.println("p1:" + p1);
//
//      if (p2 < k) {
//
//        sum += a[p1++];
//        p2++;
//      } else {
//
//        answer.add(sum);
//        p2 = 0;
//        p1 = p1 - 2;
//        sum = 0;
//
//      }
//
//
//    }
//
//    Collections.sort(answer);
//
//    return answer.get(answer.size() - 1);
//
//  }

  public int soltuion(int n, int k, int[] arr) {

    int answer, sum = 0;
    for(int i = 0; i < k; i++) sum+=arr[i];
    answer=sum;

    for(int i = k; i < n; i++) {
      sum+=(arr[i] - arr[i - k]);
      answer= Math.max(answer, sum);
    }

    return answer;

  }

  public static void main(String[] args) {

    최대_매출 T = new 최대_매출();

    Scanner kb = new Scanner(System.in);

    int n = kb.nextInt();

    int k = kb.nextInt();

    int[] a = new int[n];

    for (int i = 0; i < n; i++) {

      a[i] = kb.nextInt();

    }

    System.out.println(T.soltuion(n, k, a));


  }

}
