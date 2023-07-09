package inflearn.자바_알고리즘_문제;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
설명
N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성해라


입력
첫 줄에 자연수 N(3<=N<=20) 주어짐
두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어짐.단어는 영어 알파벳으로 구성됨

출력
N개의 단어를 입력된 순서대로 한 줄로 하나씩 뒤집어서 출력함

예시 입력 1
3
good
time
Big

예시 출력1
doog
emiT
giB

 */
public class 단어뒤집기 {


//    public static void main(String[] args) {
//
//        //3
//
//        List<String> temp = new ArrayList<>();
//        temp.add("good");
//        temp.add("Time");
//        temp.add("Big");
//
//        for (String t : temp) {
//
//            int length = t.length();
//
//            for (int i = length - 1; i >= 0; i--) {
//                System.out.print(t.charAt(i));
//            }
//
//            System.out.println("\n");
//
//        }
//
//    }


    public ArrayList<String> solution(int n, String[] str) {

        ArrayList<String> answer=new ArrayList<>();
        for(String x : str) {
            char[] s = x.toCharArray();
            int lt=0, rt=x.length() - 1;

            while(lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }

            String tmp = String.valueOf(s);
            answer.add(tmp);
        }

        return answer;


    }

    public static void main(String[] args) {

        단어뒤집기 t = new 단어뒤집기();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for(int i = 0; i < n; i++) {
            str[i] = kb.next();
        }

        for(String x: t.solution(n, str)) {
            System.out.println(x);
        }
    }
}
