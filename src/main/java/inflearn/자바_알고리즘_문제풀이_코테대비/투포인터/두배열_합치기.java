package inflearn.자바_알고리즘_문제풀이_코테대비.투포인터;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 두배열_합치기 {

//  public String solution(int[] arr1, int[] arr2) {
//
//    ArrayList<Integer> temp = new ArrayList<>();
//
//    for (int num : arr1) {
//      temp.add(num);
//    }
//
//    for (int num : arr2) {
//      temp.add(num);
//    }
//
//
//    Collections.sort(temp);
//
//    return temp.toString();
//
//  }

  public ArrayList<Integer> soltuion(int n, int m, int[] a, int[] b) {

    ArrayList<Integer> answer = new ArrayList<>();

    int p1 = 0, p2 = 0;
    while(p1 < n && p2 < m) {

      if(a[p1] < b[p2]) answer.add(a[p1++]);
      else answer.add(b[p2++]);

    }
    while (p1 < n) answer.add(a[p1++]);

    while (p2 < m) answer.add(b[p2++]);

    return answer;


  }

  public static void main(String[] args) {

    두배열_합치기 T = new 두배열_합치기();

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

//    System.out.println(T.solution(arr,trr));

    for (int x : T.soltuion(n, m, a, b)) {
      System.out.println(x+ " ");
    }

  }

}
