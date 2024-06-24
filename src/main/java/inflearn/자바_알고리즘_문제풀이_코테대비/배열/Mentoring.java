package inflearn.자바_알고리즘_문제풀이_코테대비.배열;

import java.util.Scanner;

public class Mentoring {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int[][] results = new int[M][N];

    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        results[i][j] = scanner.nextInt();
      }
    }

    scanner.close();

    int count = 0;

    for (int mentor = 1; mentor <= N; mentor++) {
      for (int mentee = 1; mentee <= N; mentee++) {
        if (mentor == mentee) continue;

        boolean canMentor = true;
        for (int k = 0; k < M; k++) {
          int mentorRank = 0, menteeRank = 0;
          for (int r = 0; r < N; r++) {
            if (results[k][r] == mentor) mentorRank = r;
            if (results[k][r] == mentee) menteeRank = r;
          }
          System.out.println("Test " + (k + 1) + " - Mentor: " + mentor + ", Mentee: " + mentee + ", MentorRank: " + mentorRank + ", MenteeRank: " + menteeRank);
          if (mentorRank > menteeRank) {
            canMentor = false;
            break;
          }
        }

        if (canMentor) {
          count++;
          System.out.println("Mentor: " + mentor + " can mentor Mentee: " + mentee);
        }
      }
    }

    System.out.println("Total mentor-mentee pairs: " + count);
  }
}
