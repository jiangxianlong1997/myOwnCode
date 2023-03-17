package 堆;
public class Heap {
//  public static void heapSort(int[] arr) {
//    heapify(arr,arr.length);
//    int size = arr.length;
//
//    while (size > 1) {
//      //固定最大值
//      System.out.println(size);
//      swap(arr, 0, size - 1);
//      size--;
//      heapify(arr, size);
//    }
//  }

  //建大顶堆
  public static void heapify(int[] array, int end) {
    //int size = array.length;
    for (int i = 0; i < end; i++) {
      int currentIndex = i;
      int parentIndex = (currentIndex - 1) / 2;
      while (array[currentIndex] > array[parentIndex]) {
        swap(array, currentIndex, parentIndex);
        currentIndex = parentIndex;
        parentIndex = (currentIndex - 1) / 2;
      }

    }

    //System.out.println("endin:"+end);
    if (end > 1) {
      //System.out.println("endout:" + end);
      swap(array, 0, end - 1);
      end--;
      heapify(array, end);
    }
  }

  public static void swap(int[] array, int current, int father) {
    int temp = array[current];
    array[current] = array[father];
    array[father] = temp;
  }

  public static void main(String[] args) {
    int[] a = {4, 5, 2, 1, 8, 10, 2};
    heapify(a, a.length);
    for (int i : a) {
      System.out.println(i);
    }
  }
}

