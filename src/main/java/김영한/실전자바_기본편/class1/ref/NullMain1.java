package 김영한.실전자바_기본편.class1.ref;


//아무도 참조하지 않는 인스턴스가 있으면 JVM의 GC(가비지 컬렉션)가 더 이상 사용하지 않는 인스턴스라 판단하고 해당 인스턴스를 자동으로 메모리에서 제거해준다.

//객체는 해당 객체를 참조하는 곳이 있으면, JVM이 종료할 때 까지 계속 생존한다. 그런데 중간에 해당 객체를 참조하는 곳이 모두 사라지면 그때 JVM은 필요 없는 객체로 판단다고 GC(가비지 컬렉션)를 사용해서 제거한다.
public class NullMain1 {

  public static void main(String[] args) {
    Data data = null;
    System.out.println("1. data = " + data);
    data = new Data();
    System.out.println("2. data = " + data);
    data = null;
    System.out.println("3. data = " + data);
  }
}