package book_자료구조와알고리즘을함께_java.chapter3;

import java.util.Arrays;

public class chapter3_deep_copy {

    public static void main(String[] args) {
        String[] folderA = {"myComputer","myDocument"};
        String[] folderB = new String[folderA.length];


        System.out.println("[사번 배열의 값 변경 전] 원본 배열: " + Arrays.toString(folderA));

        //배열의 요소들을 각각 저장
        for (int i = 0; i < folderA.length; i++) {
            folderB[i] = folderA[i];
        }

        folderB[0] = "newFolder"; //사본 배열의 첫 번째 인덱스 값 변경

        System.out.println("[사본 배열의 값 변경 후] 원본 배열: " + Arrays.toString(folderA));

        System.out.println("[사본 배열의 값 변경 후] 사본 배열: " + Arrays.toString(folderB));
    }
}
