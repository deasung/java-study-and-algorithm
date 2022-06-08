package codility.lessons;

import java.util.Arrays;

public class PermMissingElem {

//  A[0] = 2
//  A[1] = 3
//  A[2] = 1
//  A[3] = 5
//  the function should return 4, as it is the missing element.
//

  public static void main(String[] args) {


    int a[] = {2,3,1,5};


    System.out.println(solution(a));


  }


  public static int solution(int[] A) {
    // write your code in Java SE 8

    Arrays.sort(A);

    for (int i = 0; i < A.length; i++) {

      if (i + 1 != A[i])
        return i + 1;

    }

    return A.length + 1;
  }

}
