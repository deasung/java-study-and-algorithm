package codility.lessons;

//https://hojak99.tistory.com/316

/**
 * 0으로 초기화 되어 있는 N개의 카운터가 주어지며, increase(X)는 해당 카운터를 1 증가 시킴 max counter 는 모든 카운터를 가장 큰 카운터의 값으로 설정
 * 함
 * <p>
 * 비어있지 않는 M개의 요소를 가진 배열 A가 주어지며 만약 A[K] = X, 1 <= X <= N 이면 increase(X)를 한다.
 * <p>
 * 예) A[] = {3,4,4,6,1,4,4} , N = 5일때 (0,0,1,0,0) 이 이유는 인데스 값 3은 1 <= 3 <= 5 에 충족하기 때문에 해당 카운터를 1
 * 증가시킴 (0,0,1,1,0) 이 이유는 인덱스 값 4는 1 <= 4 <= 5 에 충족하기 때문이다. (0,0,1,2,0) 이 이유는 인덱스 값 4는 1 <= 4 <= 5 에
 * 충족하기 때문이다. (2,2,2,2,2) 이 이유는 인덱스 값 6에서 N + 1을 충족하기 때문에 가장 큰 카운터로 다른 카운터를 설정한다. (3,2,2,2,2) 이 이유는
 * 인덱스 값 1에서 1 <= 1 <= 5 를 충족하기 때문이다. (3,2,2,3,2) 이 이유는 인덱스 값 4는 1 <= 4 <= 5 에 충족하기 때문이다.
 * (3,2,2,4,2) 이 이유는 인덱스 값 4는 1 <= 4 <= 5 에 충족하기 때문이다.
 * <p>
 * [3, 2, 2, 4, 2] 를 반환해야 한다.
 * <p>
 * 조건 : N 과 M 은 [1...100,000] 범위의 정수 배열 A의 각 요소는 [1..N+1] 범위의 정수
 */


public class MaxCounters {


  public static void main(String[] args) {

    int A[] = {3, 4, 4, 6, 1, 4, 4};
    solution(5, A);

  }


  public static int[] solution(int N, int[] A) {
    // write your code in Java SE 8
    int countArr[] = new int[N];

    int tempMax = 0;
    int max = 0;

    for (int i = 0; i < A.length; i++) {

      if (1 <= A[i] && A[i] <= N) {

//        System.out.format(" A[i]: %d countArr[A[i]]: %d countArr[A[i]-1]:%d",A[i],countArr[A[i]],countArr[A[i]-1]);

        if (countArr[A[i] - 1] < max) {
          countArr[A[i] - 1] = max + 1;
        } else {
          ++countArr[A[i] - 1];
        }

        if (tempMax < countArr[A[i] - 1]) {
          tempMax = countArr[A[i] - 1];
        }


      } else if (A[i] == (N + 1)) {
        max = tempMax;
      }
    }

    for (int q = 0; q < 5; q++) {
      if (countArr[q] < max) {
        countArr[q] = max;
      }
    }

    for (int i : countArr) {
      System.out.println(i + " ");
    }

    return countArr;

  }
}
