package sort;

public class insertionSort {

  public static int[] insertionSort(int[] array) {
    if (array.length == 0) {
      return array;
    }
    for (int i = 0; i < array.length; i++) {
      int insertion = array[i];
      for (int j = i - 1; j >= 0; j--) {
        if (array[j] > insertion) {
          array[j + 1] = array[j];
          array[j] = insertion;
        }
      }
    }
    return array;
  }

  public static void main(String[] args) {
    int[] a = {1, 3, 5, 2, 7, 10};
    insertionSort(a);
    for (int i : a) {
      System.out.println(i);
    }
  }
}
