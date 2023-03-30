package sort;

import java.util.ArrayList;
import java.util.Collections;

public class bucketSort {

  public static int[] bucketSort(int[] array) {
    int max = array[0], min = array[0];
    for (int i = 0; i < array.length; i++) {
      if (max < array[i]) {
        max = array[i];
      }
      if (min > array[i]) {
        min = array[i];
      }
    }
    int bucketNumber = (max - min) / array.length + 1;
    ArrayList<ArrayList<Integer>> bucketArr = new ArrayList<>();
    for (int i = 0; i < bucketNumber; i++) {
      bucketArr.add(new ArrayList<Integer>());
    }

    //将每个元素放入桶
    for (int i = 0; i < array.length; i++) {
      int num = (array[i] - min) / (array.length);
      bucketArr.get(num).add(array[i]);
    }

    //对每个桶进行排序
    for (int i = 0; i < bucketArr.size(); i++) {
      Collections.sort(bucketArr.get(i));
    }

    int k = 0;
    for (int i = 0; i < bucketArr.size(); i++) {
      for (int j = 0; j < bucketArr.get(i).size(); j++) {
        array[k++] = bucketArr.get(i).get(j);
      }
    }
    return array;
  }

  public static void main(String[] args) {
    int[] a = {6, 5, 2, 1, 8, 0, 2, 1, 1, 0, 0, 8, 8, 5000};
    bucketSort(a);
    for (int i : a) {
      System.out.println(i);
    }

  }
}
