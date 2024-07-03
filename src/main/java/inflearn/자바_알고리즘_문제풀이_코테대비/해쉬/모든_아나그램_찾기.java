package inflearn.자바_알고리즘_문제풀이_코테대비.해쉬;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 모든 아나그램 찾기(해쉬, 투포인터, 슬라이딩 윈도우)
 * <p>
 * S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하 세요. 아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
 * <p>
 * ▣ 입력설명 첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다. S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.
 * <p>
 * ▣ 출력설명 S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다. ▣ 입력예제 1 bacaAacba abc
 * <p>
 * ▣ 출력예제 1 3 출력설명: {bac}, {acb}, {cba} 3개의 부분문자열이 "abc"문자열과 아나그램입니다.
 */
public class 모든_아나그램_찾기 {

  //강사가 푼 스타일
  public int solution(String a, String b) {
    int answer = 0;
    HashMap<Character, Integer> am = new HashMap<>();
    HashMap<Character, Integer> bm = new HashMap<>();
    for (char x : b.toCharArray()) {
      bm.put(x, bm.getOrDefault(x, 0) + 1);
    }
    int L = b.length() - 1;
    for (int i = 0; i < L; i++) {
      am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);
    }
    int lt = 0;
    for (int rt = L; rt < a.length(); rt++) {
      am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0) + 1);
      if (am.equals(bm)) {
        answer++;
      }
      am.put(a.charAt(lt), am.get(a.charAt(lt)) - 1);
      if (am.get(a.charAt(lt)) == 0) {
        am.remove(a.charAt(lt));
      }
      lt++;
    }
    return answer;
  }

  public static void main(String[] args) {

    모든_아나그램_찾기 t = new 모든_아나그램_찾기();

    Scanner kb = new Scanner(System.in);
    String a = kb.next();
    String b = kb.next();
    System.out.print(t.solution(a, b));

  }

}



