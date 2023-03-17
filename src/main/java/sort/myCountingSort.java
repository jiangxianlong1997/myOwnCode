package sort;

public class myCountingSort {

  public static int[] countingSort(int[] array) {
    int gap, min = array[0], max = array[0];
    for (int i = 0; i < array.length; i++) {
      if (max < array[i]) {
        max = array[i];
      }
      if (min > array[i]) {
        min = array[i];
      }
    }
    int[] new_arr = new int[max - min + 1];
    for (int i = 0; i < array.length; i++) {
      new_arr[array[i] - min]++;
    }
    int index = 0;
    for (int i = 0; i < new_arr.length; i++) {
      if (new_arr[i] != 0) {
        while (new_arr[i] > 0) {
          array[index] = i + min;
          index++;
          new_arr[i]--;
        }
      }
    }
    return array;
  }

  public static void main(String args[]) {
    int[] a = {6, 5, 2, 1, 8, 0, 2, 1, 1, 0, 0, 8, 8, 80000};
    countingSort(a);
    for (int i : a) {
      System.out.println(i);
    }
  }
}
