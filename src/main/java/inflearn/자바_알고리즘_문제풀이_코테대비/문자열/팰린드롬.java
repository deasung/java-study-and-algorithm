package inflearn.자바_알고리즘_문제풀이_코테대비.문자열;

import java.util.Scanner;

public class 팰린드롬 {


  public String soultion(String s) {

    String answer = "NO";

    s = s.toUpperCase().replaceAll("[^A-Z]","");
    String tmp = new StringBuilder(s).reverse().toString();

    if (s.equals(tmp)) answer = "YES";

    System.out.println(s);

    return answer;
  }

  public static void main(String[] args) {

    팰린드롬 t = new 팰린드롬();

    Scanner kb = new Scanner(System.in);
//    String str = kb.next();
    String str = "found7, time: study; Yduts; emit, 7Dnuof";


    if (str != null) {
      System.out.println(t.soultion(str));
    }


  }

}
