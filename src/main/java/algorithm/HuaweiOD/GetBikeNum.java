package algorithm.HuaweiOD;
/*
租用双人自行车，每辆自行车最多坐两人，最大载重M。
N 为总人数
第二行为每个人的体重
输入
3 4
3 2 2 1
输出
3
 */

import java.util.Scanner;

public class GetBikeNum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] weight = new int[n];
    for (int i = 0; i < n; i++) {
      weight[i] = sc.nextInt();
    }
    int res = 0;
    int i = 0;
    int j = n - 1;
    while (i <= j) {
      if (weight[i] + weight[j] <= m) {
        i++;
        j--;
      } else {
        j--;
      }
      res++;
    }
    System.out.println(res);
  }

}
