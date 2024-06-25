package inflearn.자바_알고리즘_문제풀이_코테대비.투포인터;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 공통원소_구하기 {


  //투포인트 알고리즘으로 안풀었네
//  public ArrayList<Integer> soltuion(int n, int m, int[] a, int[] b) {
//
//    ArrayList<Integer> answer = new ArrayList<>();
//
//    for(int i = 0; i < n; i++) {
//
//      for(int j = 0; j < m; j++) {
//
//        if(a[i] == b[j]) {
//          answer.add(a[i]);
//        }
//
//      }
//
//    }
//
//    Collections.sort(answer);
//
//
//    return answer;
//
//  }

  public ArrayList<Integer> soltuion(int n, int m, int[] a, int[] b) {

    ArrayList<Integer> answer = new ArrayList<>();
    Arrays.sort(a);
    Arrays.sort(b);
    int p1 = 0, p2 = 0;
    while (p1 < n && p2 < m) {
      if(a[p1] == b[p2]) {
        answer.add(a[p1++]);
        p2++;
      }
      else if(a[p1] < b[p2]) p1++;
      else p2++;
    }
    return answer;

  }


  public static void main(String[] args) {


    공통원소_구하기 T = new 공통원소_구하기();

    Scanner kb = new Scanner(System.in);

    int n = kb.nextInt();

    int[] a = new int[n];

    for(int i = 0; i < n; i++) {

      a[i] = kb.nextInt();

    }

    int m = kb.nextInt();

    int[] b = new int[m];

    for(int i = 0; i < m; i++) {

      b[i] = kb.nextInt();

    }


    for (int x : T.soltuion(n, m, a, b)) {
      System.out.println(x+ " ");
    }

  }

}
