package inflearn.자바_알고리즘_문제풀이_코테대비.해쉬;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class 매출액의_종류 {


//  public String solution(int k, int[] arr) {
//
//    String answer = "";
//
//    for(int i = 0; i < k; i++) {
//
//      HashSet<Integer> temp = new HashSet<>();
//
//      for(int j = i; j < k+i; j++) {
////        System.out.print(arr[j] + ",");
//        temp.add(arr[j]);
//      }
//
////      System.out.print(temp.size() + " ");
//      answer += temp.size() + " ";
//
////      System.out.println("\n");
//
//    }
//
//    return answer;
//
//  }

  public String solution(int k, int[] arr) {
    StringBuilder answer = new StringBuilder();
    HashMap<Integer, Integer> map = new HashMap<>();

    // 초기 윈도우 세팅
    for (int i = 0; i < k; i++) {
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }
    answer.append(map.size()).append(" ");

    // 슬라이딩 윈도우 처리
    for (int i = k; i < arr.length; i++) {
      // 맨 앞의 값을 제거
      int start = arr[i - k];
      if (map.get(start) == 1) {
        map.remove(start);
      } else {
        map.put(start, map.get(start) - 1);
      }

      // 새로운 값을 추가
      int end = arr[i];
      map.put(end, map.getOrDefault(end, 0) + 1);

      // 현재 고유 매출액의 수를 답에 추가
      answer.append(map.size()).append(" ");
    }

    return answer.toString().trim();
  }


  public static void main(String[] args) {

    매출액의_종류 t = new 매출액의_종류();

    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int k = kb.nextInt();

    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = kb.nextInt();
    }

    System.out.println(t.solution(k, arr));

  }

}
