package codility.lessons;

public class Binary_Gap_N {

  public static void main(String[] args) {

    System.out.println(solve(529));

  }


  public static int solve(int N) {

    String binary = Integer.toBinaryString(N);

    String[] arr = binary.split("");

    int max = 0;
    int current = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].equals("0")) {
        current++;
      } else {
        max = (max > current) ? max : current;
        current = 0;
      }
    }

    return max;

  }

}
