package 김영한.실전자바_기본편.class1.access;

public class Speaker {

  //`private` 접근 제어자는 모든 외부 호출을 막는다. 따라서 `private` 이 붙은 경우 해당 클래스 내부에서만 호출
  private int volume;

  public Speaker(int volume) {
    this.volume = volume;
  }

  public void volumeUp() {
    if (volume > 100) {
      System.out.println("음량을 증가할 수 없습니다.최대 음량입니다");
    } else {
      volume += 10;
      System.out.println("음량을 10 증가합니다");
    }
  }

  public void volumeDown() {
    volume -= 10;
    System.out.println("volumeDown 호출");
  }

  public void showVolume() {
    System.out.println("현재 음량:" + volume);
  }

}
