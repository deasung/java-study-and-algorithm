package inflearn.이주만에_통과하는_알고리즘_코딩테스트;

public class 이강_정수론 {



  public static void main(String[] args) {
    // TODO Auto-generated method stub


    //문제 2. 약수 빠르게 구하기
    //숫자 N이 주어진다.
    //이 숫자의 약수가 총 몇개가 포함되어 있는지 계산하고 싶다
    //약수의 개수와 약수들을 모두 출력하는 프로그램을 작성하시오


    //입력
    int n = 15;

    for (int i = 1; i <= 15; i++) {

      if (n % i == 0) {
        System.out.print(i + " ");
      }

    }


  }
}
