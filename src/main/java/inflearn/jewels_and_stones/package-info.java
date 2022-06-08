/**
 * 보석과 돌
 * 보석(jewels)과 돌(stones)이 주어짐
 * 보석을 이용해서 돌에 얼마나 많은 보석이 포함되는지 체크
 * 문자는 대소 문자를 구분하므로 'a',"A"은 다른 유형의 스톤으로 간주
 *
 *
 * 입출력
 * Input: jewels = "aA"
 *        stones = "aAAbbbb"
 * Output: 3
 *
 * 문제 분석
 * - 보석은 대소문자를 구분해서 갖고 있어야 한다.
 * - aA -> 2개
 * - 보석을 저장한다 set
 * Stone을 for문 루프
 * Set에 있는 값과 비교해서 count
 */
package inflearn.jewels_and_stones;