package inflearn.자바_알고리즘_문제;


/*
설명
한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하라.
문장속의 각 단어는 공백으로 구분됨


입력
첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어짐. 문장은 영어 알파벳으로 구성되어 있음

출력
첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한 단어를 답으로 함

예시 입력 1
it is time to study

예시 출력1
study

 */

import java.util.List;
import java.util.Scanner;

public class 문장속단어 {

    // 내가 푼것
//    public static void main(String[] args) {
//
//        String s = "it is time to stud1 stud2";
//
//        String temp = null;
//
//        int m = 0;
//
//
//        List<String> datas = List.of(s.split(" "));
//
//        for (String data : datas) {
//
//            int dataLength = data.length();
//
//            if (dataLength > m) {
//
//                m = dataLength;
//
//                temp = data;
//            }
//
//        }
//
//
//
//        System.out.printf(temp);
//
//    }

    public String solution(String str) {

        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for(String x : s) {
            int len = x.length();
            if(len > m) {
                m = len;
                answer=x;
            }
        }

        return answer;

    }

    public static void main(String[] args) {

        문장속단어 t = new 문장속단어();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(t.solution(str));

    }

}
