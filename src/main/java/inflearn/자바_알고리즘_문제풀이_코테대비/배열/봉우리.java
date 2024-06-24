package inflearn.자바_알고리즘_문제풀이_코테대비.배열;

import java.util.Scanner;

public class 봉우리 {


//  int[] dx={-1, 0, 1, 0};
//  int[] dy={0, 1, 0, -1};
//  public int solution(int n, int[][] arr){
//    int answer=0;
//    for(int i=0; i<n; i++){
//      for(int j=0; j<n; j++){
//        boolean flag=true;
//        for(int k=0; k<4; k++){
//          int nx=i+dx[k];
//          int ny=j+dy[k];
//          if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]){
//            flag=false;
//            break;
//          }
//        }
//        if(flag) answer++;
//      }
//    }
//    return answer;
//  }


  //내가 푼 문제.. 결과값은 비슷한디..?
  public int solution(int n, int[][] arr) {

    int total = 0;

    for (int i = 0; i < n; i++) {

      int max = 0;
      int up = -1;
      int down = 1;
      int left = -1;
      int right = 1;

      for (int j = 0; j < n; j++) {

        int temp = arr[i][j];


        up = i != 0 ? arr[i-1][j] : 0;
        left = j > 0 ? arr[i][j - 1] : 0;
        right = j != n - 1 ? arr[i][j + 1] : 0;
        down = i != n- 1 ? arr[i + 1][j]: 0;

        max = Math.max(temp, up);
        max = Math.max(max, down);
        max = Math.max(max, left);
        max = Math.max(max, right);

        if (temp >= max) {
          total++;
        }

      }


    }

    return total;


  }

  public static void main(String[] args) {

    봉우리 T = new 봉우리();

    Scanner kb = new Scanner(System.in);

    int n = kb.nextInt();

    int[][] arr = new int[n][n];

    for (int i = 0; i < n; i++) {

      for (int j = 0; j < n; j++) {

        arr[i][j] = kb.nextInt();

      }

    }

    System.out.println(T.solution(n, arr));


  }

}
