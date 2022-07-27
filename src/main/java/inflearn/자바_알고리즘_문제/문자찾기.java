package inflearn.자바_알고리즘_문제;


/*
설명
한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇개
존재하는지 알아내는 프로그램을 작성하세요.

대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.

입력
첫 줄에 문자열이 주어지고,두 번째 줄에 문자가 주어진다.
문자열은 영어 알파벳으로만 구성되어 있습니다.

출력
첫 줄에 해당 문자의 개수를 출력한다.
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class 문자찾기 {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        while (true) {

            //첫 줄에 문자열
            String input = sc.next();

            if (input.isEmpty() || input.length() == 0 || input.length() > 100)
                continue;


            //영어로만 구성성
            String lowerInput = input.toLowerCase();

            boolean check = Pattern.matches("^[a-zA-Z]*$", lowerInput);

            if (!check)
                continue;

            char checkStr = sc.next().charAt(0);


            char[] temp = lowerInput.toCharArray();

            int count = 0;

            for(char s : temp) {

                if (checkStr == s) {
                    count++;
                }

            }


            if (count != 0) {
                System.out.println(count);
                break;
            }


        }

   }

}


