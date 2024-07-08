package 김영한.실전자바_기본편.class1.oop1;

/**
 * 각각의 기능을 메서드로 만든 덕분에 각각의 기능이 모듈화 되었다.
 * 덕분에 다음과 같은 장점이 생겼다.
 *
 * **중복 제거:** 로직 중복이 제거되었다. 같은 로직이 필요하면 해당 메서드를 여러번 호출하면 된다.
 * **변경 영향 범위:** 기능을 수정할 때 해당 메서드 내부만 변경하면 된다.
 * **메서드 이름 추가:** 메서드 이름을 통해 코드를 더 쉽게 이해할 수 있다.
 *
 * **모듈화**: 쉽게 이야기해서 레고 블럭을 생각하면 된다. 필요한 블럭을 가져다 꼽아서 사용할 수 있다.
 * 여기서는 음 악 플레이어의 기능이 필요하면 해당 기능을 메서드 호출 만으로 손쉽게 사용할 수 있다.
 * 이제 음악 플레이어와 관 련된 메서드를 조립해서 프로그램을 작성할 수 있다.
 */
public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData(); //음악 플레이어 켜기

        on(data);
        //볼륨 증가
        volumeUp(data);
        //볼륨 증가
        volumeUp(data);
        //볼륨 감소
        volumeDown(data);
        //음악 플레이어 상태
        showStatus(data);
        //음악 플레이어 끄기
        off(data);
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}