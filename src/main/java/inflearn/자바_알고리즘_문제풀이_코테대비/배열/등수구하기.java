package inflearn.자바_알고리즘_문제풀이_코테대비.배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 등수구하기
 * N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
 * 같은 점수가 입력될 경우 높은 등수로 동일 처리한다. 즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
 * ▣ 입력설명
 * 첫 줄에 N(3<=N<=100)이 입력되고, 두 번째 줄에 국어점수를 의미하는 N개의 정수가 입력 된다.
 * ▣ 출력설명
 * 입력된 순서대로 등수를 출력한다.
 * ▣ 입력예제 1
 * 5
 * 87 89 92 100 76
 * ▣ 출력예제 1 43215
 */
public class 등수구하기 {


  public int[] solution(int n, int[] arr) {

    int[] answer = new int[n];

    for(int i = 0; i < n; i++) {
      int cnt = 1;

      for(int j = 0; j < n; j++) {
        if(arr[j] > arr[i]) cnt++;
      }

      answer[i] = cnt;


    }

    return answer;

  }

// 내가 푼 스타일
//  public ArrayList<Integer> solution(int n, int[] arr) {
//    // 배열을 리스트로 변환하여 ArrayList로 초기화
//    ArrayList<Integer> answer = new ArrayList<>(Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new)));
//    // 추가적인 로직이 필요하다면 여기서 구현
//
//    ArrayList<Integer> sortedList = new ArrayList<>(answer);
//
//    // 내림차순 정렬
//    sortedList.sort(Collections.reverseOrder());
//
//    // 결과를 저장할 리스트 생성
//    ArrayList<Integer> indexList = new ArrayList<>();
//
//    for (int i = 0; i < answer.size(); i++) {
//
//      int index = sortedList.indexOf(answer.get(i)) + 1;
////      System.out.print(index);
//
//      indexList.add(index);
//
//    }
//
//    return indexList;
//  }

  public static void main(String[] args) {


    등수구하기 T = new 등수구하기();
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
