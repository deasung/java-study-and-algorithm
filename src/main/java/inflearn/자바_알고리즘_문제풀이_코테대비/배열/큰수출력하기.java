package inflearn.자바_알고리즘_문제풀이_코테대비.배열;

import static java.util.stream.Collectors.toList;

import inflearn.자바_알고리즘_문제풀이_코테대비.소수_에라토스테네스_체;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 큰 수 출력하기
 *
 * N(1<=N<=100)개의 정수를 입력받아, 자신의 바로 앞 수 보다 큰수만 출력하는 프로그램을 작성하라(첫 번째 수는 무조건 출력한다)
 *
 * 입력설명
 * - 첫 줄에 자연수 N이 주어지고, 그 다음 줄에 N개의 정수가 입력됨
 *
 * 출력설명
 * - 자신의 바로 앞수보다 큰수만 한줄로 출력한다
 *
 * 입력예제
 * - 6
 * - 7 3 9 5 6 12
 *
 * 출력예제
 * 7 9 6 12
 *
 */

public class 큰수출력하기 {

//  public String solution(int n,String str) {
//
//    List<Integer> temp = Arrays.stream(str.split(" "))
//        .map(Integer::parseInt).toList();
//
//    String result = "";
//
//    for(int i = 0; i < temp.size(); i++) {
//
//      if(i == 0) {
//        result = String.valueOf(temp.get(i));
//      } else {
//
//        int tempNum = temp.get(i);
//
//        if (n < tempNum || n == tempNum) {
//          result += " " + tempNum;
//        }
//
//      }
//
//    }
//
//    return result;
//
//  }
//
//  public static void main(String[] args) {
//
//    큰수출력하기 T = new 큰수출력하기();
//    Scanner kb = new Scanner(System.in);
////    int n = kb.nextInt();
//
//    String input = kb.nextLine();
//
//    System.out.println(T.solution(6,input));
//
//    kb.close();
//
//  }

  //강사님 푼 스타일
  public ArrayList<Integer> solution(int n, int[] arr) {
    ArrayList<Integer> answer = new ArrayList<>();

    answer.add(arr[0]);

    for(int i = 1; i < n; i++) {

      if (arr[i] > arr[i-1]) answer.add(arr[i]);

    }

    return answer;
  }

  public static void main(String[] args) {

    큰수출력하기 T = new 큰수출력하기();
    Scanner kb = new Scanner(System.in);

    int n = kb.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = kb.nextInt();
    }

    for(int x : T.solution(n, arr)) {
      System.out.println(x+ " ");
    }


  }

}
