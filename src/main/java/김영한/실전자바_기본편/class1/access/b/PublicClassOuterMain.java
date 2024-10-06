package 김영한.실전자바_기본편.class1.access.b;

//import access.a.DefaultClass1;
//import 김영한.실전자바_기본편.class1.access.a.DefaultClass1;
import 김영한.실전자바_기본편.class1.access.a.PublicClass;
public class PublicClassOuterMain {


  public static void main(String[] args) {
    PublicClass publicClass = new PublicClass();

    //다른 패키지 접근 불가
//    DefaultClass1 class1 = new DefaultClass1();
    //DefaultClass2 class2 = new DefaultClass2();

  }

}
