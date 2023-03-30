package sort;

import java.util.Arrays;

public class mergeSort {

  public static int[] MergeSort(int[] array) {
    if (array.length < 2) {
      return array;
    }
    int mid = array.length / 2;
    int[] left = Arrays.copyOfRange(array, 0, mid);
    int[] right = Arrays.copyOfRange(array, mid, array.length);
    return merge(MergeSort(left), MergeSort(right));
  }

  public static int[] merge(int[] left, int[] right) {
    int[] result = new int[left.length + right.length];
    int fif = 0;
    int sif = 0;
    int tif = 0;
    int fourthif = 0;
    for (int index = 0, i = 0, j = 0; index < result.length; index++) {
      // System.out.println("i: " + i);
      // System.out.println("j: " + j);
      if (i >= left.length) {
        result[index] = right[j++];
        fif++;
        System.out.println("firstif :" + fif);
      } else if (j >= right.length) {
        System.out.println(right.length);
        result[index] = left[i++];
        sif++;
        System.out.println("secondif: " + sif);
      } else if (left[i] > right[j]) {
        result[index] = right[j++];
        tif++;
        System.out.println("thirdif: " + tif);
      } else {
        result[index] = left[i++];
        fourthif++;
        System.out.println("fourthif: " + fourthif);
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[] a = {6, 5, 2, 1, 8, 11, 0, 45, 23};
    a = MergeSort(a);
    // for(int i : a){
    // 	System.out.println(i);
    // }
  }
}
