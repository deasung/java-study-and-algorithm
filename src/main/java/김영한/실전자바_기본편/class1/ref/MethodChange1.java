package 김영한.실전자바_기본편.class1.ref;

public class MethodChange1 {

  public static void main(String[] args) {
    int a = 10;
    System.out.println("메서드 호출 전: a = " + a);
    changePrimitive(a);
    System.out.println("메서드 호출 후: a = " + a);
  }

  static void changePrimitive(int x) {
    x = 20;
  }
}