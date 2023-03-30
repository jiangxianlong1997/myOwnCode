package sort;

public class countingSort {

  //  public static int[] countingSort(int[] array) {
//    if(array.length <= 1) { return array; }
//    int bias, minindex = Integer.MIN_VALUE, maxIndex = Integer.MAX_VALUE;
//  }
  public static int[] CountingSort(int[] array) {
    if (array.length == 0) {
      return array;
    }
    int bias, min = array[0], max = array[0];

    for (int j : array) {
      if (j > max) {
        max = j;
      }
      if (j < min) {
        min = j;
      }
    }
    //计算偏移量，将 min ~ max 映射到 bucket 数组的 0 ~ (max - min) 位置上
    bias = -min;
    int[] bucket = new int[max - min + 1];
    for (int i = 0; i < array.length; i++) {
      bucket[array[i] + bias]++;
    }
    int index = 0, i = 0;
    while (index < array.length) {
      if (bucket[i] != 0) {
        array[index] = i - bias;
        bucket[i]--;
        index++;
      } else {
        i++;
      }
    }
    return array;
  }

  public static void main(String[] args) {
    int[] a = {6, 5, 2, 1, 8, 0, 2, 1, 1, 0, 0, 8, 8, 5000};
    CountingSort(a);
    for (int i : a) {
      System.out.println(i);
    }
  }
}
