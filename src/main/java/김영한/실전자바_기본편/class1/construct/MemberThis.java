package 김영한.실전자바_기본편.class1.construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter;
    }
}

//public class MemberThis {
//    String nameField;
//
//    void initMember(String nameParameter) {
//        this.nameField = nameParameter;
//    }
//}