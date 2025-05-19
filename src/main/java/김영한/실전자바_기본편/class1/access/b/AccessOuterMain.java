package 김영한.실전자바_기본편.class1.access.b;

import 김영한.실전자바_기본편.class1.access.a.AccessData;

public class AccessOuterMain {

  public static void main(String[] args) {
    AccessData data = new AccessData(); //public 호출 가능
    data.publicField = 1;
    data.publicMethod();

    //다른 패키지 default 호출 불가 , default는 같은 패키지에서 접근 할수 있음
    //data.defaultField = 2;
    //data.defaultMethod();

    //private 호출 불가
    //data.privateField = 3;
    //data.privateMethod();

    data.innerAccess();
  }
}