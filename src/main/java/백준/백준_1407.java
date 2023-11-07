package 백준;

public class 백준_1407 {


  public int fx(int n) {

    int count = 0; // 거듭제곱을 초기화
    while (n % 2 == 0) { // n이 2로 나눌 수 있는 한 반복
      n /= 2; // n을 2로 나눔
      count++; // 거듭제곱 증가
    }

    return (int) Math.pow(2, count);
  }

  public static void main(String[] args) {

    백준_1407 t = new 백준_1407();

    int f = t.fx(40);

    int result = 0;

    for(int i = 25; i <= 28; i++) {

      result += t.fx(i);

    }

    System.out.println(result);


  }
}
