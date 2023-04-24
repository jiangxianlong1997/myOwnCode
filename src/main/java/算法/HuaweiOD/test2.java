package 算法.HuaweiOD;

import java.util.Scanner;

public class test2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 0;
    int x = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        x = sc.nextInt();
        ans += x;
      }
    }
    System.out.println(ans);
  }

}
