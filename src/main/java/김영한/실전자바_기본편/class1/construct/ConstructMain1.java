package 김영한.실전자바_기본편.class1.construct;

/**
 * **생성자 호출**
 * 생성자는 인스턴스를 생성하고 나서 즉시 호출된다. 생성자를 호출하는 방법은 다음 코드와 같이 `new` 명령어 다음에
 * 생성자 이름과 매개변수에 맞추어 인수를 전달하면 된다.
 *
 * 생성자의 진짜 장점은 객체를 생성할 때 직접 정의한 생성자가 있다면 **직접 정의한 생성자를 반드시 호출**해야 한다는 점 이다. 참고로 생성자를 메서드 오버로딩 처럼 여러개 정의할 수 있는데, 이 경우에는 하나만 호출
 * 좋은 프로그램은 무한한 자유도가 주어지는 프로그램이 아니라 적절한 제약이 있는 프로그램이다
 */
public class ConstructMain1 {
    public static void main(String[] args) {

        //참고로 `new` 키워드를 사용해서 객체를 생성할 때 마지막에 괄호 `()` 도 포함해야 하는 이유가 바로 생성자 때문이다. 객 체를 생성하면서 동시에 생성자를 호출한다는 의미를 포함
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);
        MemberConstruct[] members = {member1, member2};
        for (MemberConstruct s : members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
    }
}
