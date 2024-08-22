package 김영한.실전자바_기본편.class1.access.a;

public class PublicClass {

  public static void main(String[] args) {

    PublicClass publicClass = new PublicClass();
    DefaultClass1 class1 = new DefaultClass1();
    DefaultClass2 class2 = new DefaultClass2();

  }

}

//이 클래스는 `default` 이기 때문에 같은
//패키지 내부에서만 접근할 수 있다.
class DefaultClass1 {

}

class DefaultClass2 {

}
