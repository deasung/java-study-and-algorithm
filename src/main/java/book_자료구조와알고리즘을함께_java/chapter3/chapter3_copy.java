package book_자료구조와알고리즘을함께_java.chapter3;

import java.util.Arrays;

public class chapter3_copy {

    public static void main(String[] args) {

        String[] folderA = {"myComputer","myDocument"};
        String[] folderB = folderA;

        System.out.println("[사본 배열의 값 변경 전] 원본 배열: " + Arrays.toString(folderA));

        folderB[0] = "newFolder"; //사본 배열의 첫번째 인덱스 값 변경

        System.out.println("[사본 배열의 값 변경 후] 원본 배열: " + Arrays.toString(folderA));

        System.out.println("[사본 배열의 값 변경 후] 사본 배열: " + Arrays.toString(folderB));


    }
}
