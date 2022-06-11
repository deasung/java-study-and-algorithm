package codility.lessons;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {


  public static void main(String[] args) {

    int[] A = {1,3,1,4,2,3,5,4};

    System.out.println(solution(5,A));

  }

  public static int solution(int X, int[] A) {

    if (A == null)
      return -1;

    Set<Integer> marks = new HashSet<>();

    for (int i = 0; i < A.length; i++) {

      if (A[i] <= X) {
        marks.add(A[i]);

        if (marks.size() == X) {
          return i;
        }

      }

    }

    return -1;

  }

}
