package inflearn.자바_알고리즘_문제;

import java.util.Scanner;

public class 문자찾기_인프런 {

    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();

        t = Character.toUpperCase(t);

        System.out.println(str + " " + t);

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == t) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {


        문자찾기_인프런 T = new 문자찾기_인프런();
        Scanner kb = new Scanner(System.in);
        String str = kb.next(); //Computercooler
        char c = kb.next().charAt(0); //c
        System.out.println(T.solution(str,c));

    }
}
