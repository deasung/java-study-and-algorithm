package inflearn.자바_알고리즘_문제;

import java.util.Scanner;

/**
 * 피보나치 수열 피보나치 수열을 출력함 , 피보나치 수열이란 앞의 2개의 수를 합하여 다른 숫자가 되는 수열 입력은 피보나치 수열의 총 합의 수이다 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 됨
 * <p>
 * n은 (3<=5<=45) 입력 10 출력 1 1 2 3 5 8 13 21 34 55
 */
public class 피보나치수열 {


  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] arr = new int[n];
    arr[0] = 1;
    arr[1] = 1;

    for (int i = 2; i < n; i++) {
      arr[i] = arr[i-2] + arr[i-1];
    }

    for (int x : arr) {
      System.out.print(x + " ");
    }

  }
}
