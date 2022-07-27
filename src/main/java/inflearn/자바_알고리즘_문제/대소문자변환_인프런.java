package inflearn.자바_알고리즘_문제;

import java.util.Scanner;

public class 대소문자변환_인프런 {

    public String solution(String str) {
        String answer = "";
        for(char x : str.toCharArray()) {
            if(x >= 97 && x <= 122) { //소문자
                answer += (char)(x - 32);
            } else {
                answer += (char)(x + 32);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        대소문자변환_인프런 T = new 대소문자변환_인프런();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
