package HuaweiOD;
/*
租用双人自行车，每辆自行车最多坐两人，最大载重M。
N 为总人数
第二行为每个人的体中
输入
3 4
3 2 2 1
输出
3
 */

import java.util.ArrayList;
import java.util.Scanner;

public class GetBikeNum {

  private static int[] bubbleSort(int[] array) {
    if (array.length == 0) {
      return array;
    }
    for (int i = 0; i < array.length; i++) {
      for (int j = i; j < array.length; j++) {
        if (array[i] > array[j]) {
          int temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }
    return array;
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int x = 0;
    int[] array= new int[b];
    for (int i = 0; i < b; i++) {
      x = in.nextInt();
      array[i] = x;
    }
    bubbleSort(array);
    int counter = 0;
    ArrayList<Integer> temp = new ArrayList<>();
    for(int i = 0 ; i < array.length; i++) {
      for(int j = i + 1; j < array.length; j ++) {
//       System.out.println("temp " + temp);
        if (array[i] + array[j] >= a && !temp.contains(j)) {
          counter++;
          temp.add(j);
//          System.out.println("i " + i + " j " + j +" counter " +counter);
          break;
        }
      }
    }
    System.out.println(b - 2 * counter);

  }

}
