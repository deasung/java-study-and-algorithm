package codility;

/**
 * public int[] solution(int[] A, int K) {
 *         // write your code in Java SE 8
 *     }
 *
 For example, given

 A = [3, 8, 9, 7, 6]
 K = 3
 the function should return [9, 7, 6, 3, 8]. Three rotations were made:

 [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
 [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
 [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
 */
public class CyclicRotation {


  public static void main(String[] args) {

    int a[] = {3,8,9,7,6};

    System.out.println(solution(a,3));



  }


  public static int[] solution(int[] A, int K) {

    // 3,8,9,7,6

    // i = 3 ; i >= 0(true) ; i-- , A[4] = 7
    // i = 2 ; i >= 0(true) ; i-- , A[3] = 9
    // i = 1 ; i >= 0(true) ; i-- , A[2] = 8
    // i = 0 ; i >= 0(true) ; i-- , A[1] = 3

    if (A.length == 0) return A;

    for (int i = 0; i < K; i++) {

      int len = A.length; //5

      int temp = A[len - 1]; //6

      for (int j = len - 2; j >= 0; j--) {
        A[j + 1] = A[j];
      }

      A[0] = temp;

    }

//    Arrays.stream(A).forEach(a -> {
//      System.out.print(a+",");
//    });

    return A;

  }


}
