package 김영한.실전자바_기본편.class1.construct;

public class MemberConstruct {

  String name;
  int age;
  int grade;

  MemberConstruct(String name, int age) {
    this(name, age, 50); //변경  this()` 는 생성자 코드의 첫줄에만 작성할 수 있다.
  }

  MemberConstruct(String name, int age, int grade) {
    System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" +
        grade);
    this.name = name;
    this.age = age;
    this.grade = grade;
  }
}
