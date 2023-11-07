package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준_10844 {


  public static void main(String[] args) {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int cnt = 0;

    try {

      int n = Integer.parseInt(br.readLine());

      if (n >= 1 && n <= 100) {


        for (int i = 1; i <= n * 10; i++) {

          if (i != n * 10) {

            if (i == 1) {
              cnt++;
              continue;
            }

            System.out.println("i " + i + " i-1 " + (i - 1) + " abs:" + Math.abs(i - (i - 1)));

            if (Math.abs(i - (i - 1)) == 1) {
              cnt++;
            }


          }


        }

      }

      System.out.println(cnt);

    } catch (NumberFormatException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }


  }
}
