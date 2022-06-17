package programmers;//package programmers;

import java.util.HashMap;
import java.util.HashSet;


//https://programmers.co.kr/learn/courses/30/lessons/92334?language=java
//
//
//muzi :  frodo, neo (2)
//frodo : neo, (1)
//apeach: frodo, muzi  (2)
//neo : (0)
//[2,1,1,0]

/**
 * 유저 ID	유저가 신고한 ID	설명 "muzi"	"frodo"	"muzi"가 "frodo"를 신고했습니다. "apeach"	"frodo"	"apeach"가 "frodo"를 신고했습니다. "frodo"	"neo"	"frodo"가 "neo"를 신고했습니다. "muzi"	"neo"	"muzi"가 "neo"를 신고했습니다.
 * "apeach"	"muzi"	"apeach"가 "muzi"를 신고했습니다. 각 유저별로 신고당한 횟수는 다음과 같습니다.
 * <p>
 * <p>
 * 유저 ID	신고당한 횟수 "muzi"	1 "frodo"	2 "apeach"	0 "neo"	2
 * <p>
 * 유저 ID	유저가 신고한 ID	정지된 ID "muzi"	["frodo", "neo"]	["frodo", "neo"] "frodo"	["neo"]	["neo"] "apeach"	["muzi", "frodo"]	["frodo"] "neo"	없음	없음 따라서 "muzi"는 처리 결과 메일을 2회, "frodo"와 "apeach"는 각각 처리 결과 메일을
 * 1회 받게 됩니다.
 *
 * https://devdange.tistory.com/entry/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%8B%A0%EA%B3%A0-%EA%B2%B0%EA%B3%BC-%EB%B0%9B%EA%B8%B0-for-Java-HashMap-%EB%A5%BC-%EC%A0%81%EC%9A%A9%ED%95%9C-%ED%92%80%EC%9D%B4
 */
public class Test92334 {


  public static void main(String[] args) {

    String[] id_list = {"muzi", "frodo", "apeach", "neo"};

    String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};

    System.out.println(solution(id_list, report, 2));

  }

  public static int[] solution(String[] id_list, String[] report, int k) {
    int[] answer = new int[id_list.length];

    HashMap<String, HashSet<String>> reporterInfoMap = new HashMap<>();
    HashMap<String, Integer> reportedCountInfoMap = new HashMap<>();



    for (String reportInfo : report) {

      String reporter = reportInfo.split(" ")[0];  // 신고 한 사람
      String reported = reportInfo.split(" ")[1];  // 신고 당한 사람
      boolean flag = false;

      if (reporterInfoMap.containsKey(reporter)) {

        if (reporterInfoMap.get(reporter).contains(reported)) {
          // 이미 신고한 유저를 또 신고했을 경우
          flag = true;
        } else {
          reporterInfoMap.get(reporter).add(reported);
        }

      } else {
        reporterInfoMap.put(reporter, new HashSet<String>() {{
          add(reported);
        }});
      }

      if (flag) {
        continue;
      } else if (reportedCountInfoMap.containsKey(reported)) {
        reportedCountInfoMap.put(reported, reportedCountInfoMap.get(reported) + 1);
      } else {
        reportedCountInfoMap.put(reported, 1);
      }

    }

    for (String reported : reportedCountInfoMap.keySet()) {
      int reportedCount = reportedCountInfoMap.get(reported);
      if (reportedCount >= k) {
        // 메일 발송 대상
        for (int i = 0; i < id_list.length; i++) {
          if (reporterInfoMap.get(id_list[i]) == null) {
            answer[i] = 0;
          } else if (reporterInfoMap.get(id_list[i]).contains(reported)) {
            answer[i]++;
          }
        }
      }
    }

    for (int i : answer) {
        System.out.println(i);
    }

    return answer;

  }

}
