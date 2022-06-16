import java.util.Arrays;

public class GlowpickTemp {


  public static void main(String[] args) {

//    이번달 날짜: [1,2,3,4,5 ... 30]
//    출석일 날짜: [1,2,       5, 6, 7, 15,30]
//    정상결과 : 3

//    int a[] = {1, 2, 5, 6, 7, 15, 30};
    int a[] = {11,22,23,24,30};

    System.out.println(solution(a));

  }


  public static int solution(int A[]) {

    Arrays.sort(A);

    int result = 0;

    //1, 2, 5, 6, 7, 15, 30
    for (int i = 0 ; i < A.length; i++) {

      if (A[i] + 1 != A[i + 1]) {
        result = A[i] + 1;
        break;
      }

    }

    return result;
  }
}
