package sort;

public class bubblesort {

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
    int[] a = {1, 3, 5, 2, 0};
    bubbleSort(a);
    for (int i : a) {
      System.out.println(i);
    }
  }
}
