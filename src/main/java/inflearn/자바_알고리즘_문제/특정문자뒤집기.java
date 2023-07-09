package inflearn.자바_알고리즘_문제;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*

5.특정 문자 뒤집기

설명
영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성

입력
첫 줄에 길이가 100을 넘지 않는 문자열이 주어짐.

출력
첫 줄에 알파벳만 뒤집힌 문자열을 출력

예시 입력1
a#b!GE*T@S

예시 출력1
S#T!EG*b@a

 */
public class 특정문자뒤집기 {

    public boolean isSpecialCharacter(char ch) {
        // ASCII 값으로 특수 문자 범위를 체크합니다.
        if ((ch >= 33 && ch <= 47) ||
                (ch >= 58 && ch <= 64) ||
                (ch >= 91 && ch <= 96) ||
                (ch >= 123 && ch <= 126)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        특정문자뒤집기 t = new 특정문자뒤집기();

        String s = "a#b!GE*T@S";

        char[] c = s.toCharArray();

        int lt=0, rt= c.length - 1;

        while(lt < rt) {

            char c1 = c[lt];
            char c2 = c[rt];

            if(!t.isSpecialCharacter(c1) && !t.isSpecialCharacter(c2)) {

                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;

            }

            lt++;
            rt--;
        }

        String tmp = String.valueOf(c);


        System.out.println(tmp);
    }


}
