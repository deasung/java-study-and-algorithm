package 김영한.실전자바_기본편.class1.ref;

public class NullMain2 {

  public static void main(String[] args) {
    Data data = null;
    data.value = 10;// NullPointerException 예외 발생 System.out.println("data = " + data.value);
  }
}