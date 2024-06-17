package inflearn.자바_알고리즘_문제풀이_코테대비.배열;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 뒤집은 소수 N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하 는 프로그램을 작성하세요. 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출 력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다. 첫 자리부터의 연속된 0은 무시한다. ▣ 입력설명 첫 줄에 자연수의 개수
 * N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다. 각 자연수의 크기는 100,000를 넘지 않는다. ▣ 출력설명 첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다. ▣ 입력예제 1 9 32 55 62 20 250 370 200 30 100 ▣ 출력예제 1 23 2 73 2 3
 */

public class 뒤집은_소수 {

//  public String solution(int n, int[] arr) {
//
//    String answer = "";
//
//    for (int j : arr) {
//
//      String temp = new StringBuilder(String.valueOf(j)).reverse().toString();
//
//      int parseTemp = Integer.parseInt(temp);
//
//      if (isPrime(parseTemp)) {
//
//
//        answer += " " + parseTemp;
//
//      }
//
//    }
//
//    return answer;
//
//  }

  //강사가 푼 스타일

//  public static boolean isPrime(int n) {
//
//    if (n == 1)
//      return false;
//
//    for (int i = 2; i<=(int)Math.sqrt(n); i++) {
//      if (n % i == 0) {
//        return false;
//      }
//    }
//    return true;
//  }

  public boolean isPrime(int num) {
    if (num == 1) {
      return false;
    }
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  public ArrayList<Integer> solution(int n, int[] arr) {
    ArrayList<Integer> answer = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      int tmp = arr[i];
      int res = 0;
      while (tmp > 0) {
        int t = tmp % 10;
        res = res * 10 + t;
        tmp = tmp / 10;
      }
      if (isPrime(res)) {
        answer.add(res);
      }
    }
    return answer;
  }

  public static void main(String[] args) {

    뒤집은_소수 T = new 뒤집은_소수();
    Scanner kb = new Scanner(System.in);

    int n = kb.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = kb.nextInt();
    }

    for(int x : T.solution(n, arr)){
      System.out.print(x+" ");
    }


  }

}
