package 백준.사칙연산.문제_10430;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int C = scanner.nextInt();

    // (A + B) % C
    int result1 = (A + B) % C;
    System.out.println(result1);

    // ((A % C) + (B % C)) % C
    int result2 = ((A % C) + (B % C)) % C;
    System.out.println(result2);

    // (A * B) % C
    int result3 = (A * B) % C;
    System.out.println(result3);

    // ((A % C) * (B % C)) % C
    int result4 = ((A % C) * (B % C)) % C;
    System.out.println(result4);

    scanner.close();


  }

}
