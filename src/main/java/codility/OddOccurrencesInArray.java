package codility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//
//For example, given array A such that:
//
//    A[0] = 9  A[1] = 3  A[2] = 9
//    A[3] = 3  A[4] = 9  A[5] = 7
//    A[6] = 9
//    the function should return 7, as explained in the example above.
public class OddOccurrencesInArray {


  public static void main(String[] args) {

    int a[] = {9, 3, 9, 3, 9, 7, 9};

    System.out.println(solution(a));

  }


  public static int solution(int[] A) {
    // write your code in Java SE 8

    int answer = -1;
    HashSet<Integer> hs = new HashSet<>();

    int size = A.length;
    for (int i = 0; i < size; i++) {
      if (hs.contains(A[i])) {
        //존재
        hs.remove(A[i]);
      } else {
        //없으면
        hs.add(A[i]);
      }
    }
    ArrayList<Integer> al = new ArrayList<>(hs);
    answer = al.get(0);
    return answer;


  }

}
