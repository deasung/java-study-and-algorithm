package inflearn.자바_알고리즘_문제;

//설명
//대소문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는
//프로그램을 작성하세요.

//입력
//첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
//문자열은 영어 알파벳으로만 구성되어 있습니다.

//출력
//첫 줄에 대문자는 소문자로,소문자는 대문자로 변환된 문자열을 출력함

import java.util.Scanner;

public class 대소문자변환 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String inputStr = sc.next(); //StuDY

        char[] temp = inputStr.toCharArray();

        String result = "";

        for(char c : temp) {

            if (Character.isLowerCase(c)) {
                result += Character.toUpperCase(c);
            } else if(Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            }

        }

        System.out.println(result); //sTUdy

    }
}
