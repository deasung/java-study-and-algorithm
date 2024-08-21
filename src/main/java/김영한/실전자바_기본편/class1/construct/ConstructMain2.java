package 김영한.실전자바_기본편.class1.construct;


public class ConstructMain2 {
    public static void main(String[] args) {

        //참고로 `new` 키워드를 사용해서 객체를 생성할 때 마지막에 괄호 `()` 도 포함해야 하는 이유가 바로 생성자 때문이다. 객 체를 생성하면서 동시에 생성자를 호출한다는 의미를 포함
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16);
        MemberConstruct[] members = {member1, member2};
        for (MemberConstruct s : members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
    }
}
