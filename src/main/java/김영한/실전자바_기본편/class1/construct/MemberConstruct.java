package 김영한.실전자바_기본편.class1.construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //생성자의 이름은 클래스 이름과 같아야 한다. 따라서 첫 글자도 대문자로 시작한다.
    //생성자는 반환 타입이 없다. 비워두어야 한다.
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" +
                grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}