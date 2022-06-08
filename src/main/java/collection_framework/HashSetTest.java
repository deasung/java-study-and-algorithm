package collection_framework;

/**
 * HashSet
 * Set 인터페이스에서 지원하는 구현 클래스
 *
 * - 순서대로 입력되지 않고, 일정하게 유지되지 않는게 특징
 * - HashSet은 null 요소도 허용
 * - 가장 큰 특징은 중복을 허용하지 않는다는 것
 *
 * 중복을 걸러내는 과정
 * HashSet은 객체를 저장하기 전에 먼저 객체의 hashCode()메소드를 호출해서 해시 코드를 얻어낸 다음
 * 저장되어 있는 객체들의 해시 코드와 비교한 뒤 같은 해시 코드가 있다면 다시 equals() 메소드로
 * 두 객체를 비교해서 true가 나오면 동일한 객체로 판단하고 중복 저장을 하지 않습니다.
 *
 * 문자열을 HashSet에 저장할 경우, 같은 문자열을 갖는 String객체는 동일한 객체로 간주되고
 * 다른 문자열을 갖는 String객체는 다른 객체로 간주되는데, 그 이유는 String클래스가
 * hashCode()와 equals() 메소드를 재정의해서 같은 문자열일 경우 hashCode()의 리턴 값을 같게,
 * equals()의 리턴 값은 true가 나오도록 했기 때문
 *
 *
 */
public class HashSetTest {



}

