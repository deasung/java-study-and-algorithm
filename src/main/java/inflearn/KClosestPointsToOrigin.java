package inflearn;


import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 원점에 가장 가까운 지점 (K Closest Points to Origin)
 * XY 평면의 한 점 과 정수를 나타내는 배열이 주어지면 원점에 가장 가까운 점을 반환합니다
 * XY 평면 에서 두 점 사이의 거리 구하는 공식을 이용하세요.
 * √(x1 - x2)거듭제곱 + (y1 - y2)거듭제곱
 * 원점에서 제일 가까운 좌표를 k개의 갯수만큼 리턴하세요
 */
public class KClosestPointsToOrigin {


    public static void main(String[] args) {
        KClosestPointsToOrigin a = new KClosestPointsToOrigin();

        int[][] points = {{1, 3}, {-2, 2}};
        int k = 1;
//        int[][] points = {{3,3},{5,-1},{-2,4}};
//        int k = 2;
//        int[][] result = a.s
        int[][] result = a.solve(points, k);
    }

    public int[][] solve(int[][] points, int k) {

        // 1.ds
        Queue<int[]> pq = new PriorityQueue<>((a, b) ->
                (a[0] * a[1] + a[1] * a[1]) - (b[0] * b[0] + b[1] * b[1]));

        int[][] res = new int[k][2]; //k==1

        // 2. for, while
        for (int[] p : points)
            pq.offer(p);

        int index = 0;
        while (index < k) {
            res[index] = pq.poll();
            index++;
        }

        return res;

    }
}
