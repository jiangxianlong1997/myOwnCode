package 搜狐;

public class ShowMeBug {
  public final int[][] arr;

  public ShowMeBug(int[][] arr) {
    this.arr = arr;
  }

  public static void main(String[] args) {
    int[][] arr = new int[][]{
        {0, 0, 0},
        {1, 1, 1},
        {0, 0, 0}
    };

    final ShowMeBug showMeBug = new ShowMeBug(arr);

    showMeBug.updateNextState(arr);
  }

  /**
   * 更新arr下个tick的生存状态
   *
   * @param arr 当前状态下的数组
   */
  public void updateNextState(int[][] arr) {
    int M = arr.length;
    int N = arr[0].length;
    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        arr[i][j] = getNextVal(arr, i, j);
      }
    }
  }

  /**
   * 计算某细胞下个tick的状态
   *
   * @param arr 当前状态下的数组
   * @param i   行索引
   * @param j   列索引
   * @return 生存返回1，否则返回0
   */
  private int getNextVal(int[][] arr, int i, int j) {
    int nextVal = 0;
    //TODO:请完善该函数，要求：需要调用countLivingNeighbors
    return nextVal;
  }

  /**
   * 计算某细胞的存活邻居数量
   *
   * @param arr 当前状态下的数组
   * @param i   行索引
   * @param j   列索引
   * @return 该元素存活的邻居数量
   */
  private int countLivingNeighbors(int[][] arr, int i, int j) {
    int count = 0;
    //TODO:请完善该函数
    return count;
  }

}
