package sort;

public class myHeapsort {

  public static void swap(int[] array, int first, int end) {
    int temp = array[first];
    array[first] = array[end];
    array[end] = temp;
  }

  public static void heapSort(int[] array, int size) {
    for (int i = 0; i < size; i++) {
      int currentIndex = i;
      int parentIndex = (i - 1) / 2;
      while (array[currentIndex] > array[parentIndex]) {
        swap(array, currentIndex, parentIndex);
        currentIndex = parentIndex;
        parentIndex = (currentIndex - 1) / 2;
      }
    }
    if (size > 1) {
      swap(array, 0, size - 1);
      size--;
      heapSort(array, size);
    }
  }

  public static void main(String[] args) {
    int a[] = {1, 45, 7, 3, 7, 34, 8, 2, 11};
    heapSort(a, a.length);
    for (int i : a) {
      System.out.println(i);
    }
  }
}
