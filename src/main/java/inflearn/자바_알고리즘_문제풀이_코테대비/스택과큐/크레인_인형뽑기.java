package inflearn.자바_알고리즘_문제풀이_코테대비.스택과큐;

import java.util.Scanner;
import java.util.Stack;


/**
 *
 * 크레인 인형뽑기(카카오)
 *
 * 입력예제 1
 * 5
 * 0 0 0 0 0
 * 0 0 1 0 3
 * 0 2 5 0 1
 * 4 2 4 4 2
 * 3 5 1 3 1
 * 8
 * 1 5 3 5 1 2 1 4
 *
 * 출력예제 1
 * 4
 */
public class 크레인_인형뽑기 {

    public int solution(int[][] board, int[] moves) {

        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        //크레인의 위치
        for (int pos : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][pos - 1] != 0) {
                    int tmp = board[i][pos - 1];
                    board[i][pos - 1] = 0;
                    if (!stack.isEmpty() && tmp == stack.peek()) {
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.push(tmp);
                    }
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        크레인_인형뽑기 t = new 크레인_인형뽑기();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = kb.nextInt();
            }
        }

        int m = kb.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = kb.nextInt();
        }

        System.out.println(t.solution(board, moves));

    }


}
