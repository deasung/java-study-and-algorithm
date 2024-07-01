package inflearn.자바_알고리즘_문제풀이_코테대비.해쉬;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Scanner;

public class 학급회장 {


//  강사가 푼 스타일
//  public char solution(int n, String s){
//    char answer=' ';
//    HashMap<Character, Integer> map=new HashMap<>();
//    for(char x : s.toCharArray()){
//      map.put(x, map.getOrDefault(x, 0)+1);
//    }
//    //System.out.println(map.containsKey('F'));
//    //System.out.println(map.size());
//    //System.out.println(map.remove('C'));
//
//    int max=Integer.MIN_VALUE;
//    for(char key : map.keySet()){
//      //System.out.println(key+" "+map.get(key));
//      if(map.get(key)>max){
//        max=map.get(key);
//        answer=key;
//      }
//    }
//    return answer;
//  }

  public String solution(int n, String s) {

    Map<String, Integer> result = new HashMap<>();

    char[] temp = s.toCharArray();


    for(int i = 0; i < temp.length; i++) {

      String key = Character.toString(temp[i]);

      int count = result.get(key) != null ? result.get(key) : 0;

      result.put(key,++count);

    }

    Optional<Entry<String, Integer>> maxEntry = result.entrySet()
        .stream()
        .max(Map.Entry.comparingByValue());


    if (maxEntry.isPresent()) {
      return maxEntry.get().getKey();
    }


    return null;
  }

  public static void main(String[] args) {


    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    String s = kb.next();

    학급회장 t = new 학급회장();

    System.out.println(t.solution(n,s));


  }

}
