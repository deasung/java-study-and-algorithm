package codility.lessons;


/**
 * For example, given:
 *
 *   X = 10
 *   Y = 85
 *   D = 30
 * the function should return 3, because the frog will be positioned as follows:
 *
 * after the first jump, at position 10 + 30 = 40
 * after the second jump, at position 10 + 30 + 30 = 70
 * after the third jump, at position 10 + 30 + 30 + 30 = 100
 */

public class FrogJmp {

  public static void main(String[] args) {


    int result = solution(10,85,30);

    System.out.println(result);

  }

  public static int solution(int X, int Y, int D) {
    // write your code in Java SE 8

    int val = Y-X;
    int solve = val/D;

    return val % D == 0 ? solve : solve + 1;

    //Math.ceil
    //return(int)Math.ceil((Y-X)/(double)D);

  }

}
