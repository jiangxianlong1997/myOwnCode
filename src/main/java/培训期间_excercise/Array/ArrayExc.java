package 培训期间_excercise.Array;


import java.util.LinkedList;
import java.util.Queue;

/**
 * 题目：给定一个二维字符串数组 board，它表示一个迷宫地图，其中 "." 表示空地， "#" 表示障碍物。假设起点为左上角（0, 0），
 * 终点为右下角（m-1, n-1），请你找出一条从起点到终点的最短路径，路径上只能经过空地，不能经过障碍物。
 * 示例：
 * board = [
 *   [".",".",".",".","#"],
 *   ["#",".","#",".","."],
 *   [".",".",".",".","."],
 *   [".","#","#",".","."],
 *   [".",".",".",".","."]
 * ]
 * 输出：8
 * 解释：从起点 (0, 0) 到终点 (4, 4) 可以沿着下面的路径走："0,0" -> "1,0" -> "1,1" -> "1,2" -> "2,2" -> "3,2" -> "3,3" -> "4,3" -> "4,4"，
 * 路径长度为8。
 * 要求：请编写一个Java函数，接收一个字符串数组表示地图，返回从起点到终点的最短路径的长度。如果不存在从起点到终点的路径，则返回 -1。
 */
public class ArrayExc {

  /**
   * 最短路径solution: BFS 广度优先搜索
   * @param board 地图
   * @return 最短路径长度
   */
  public int BFS(String[][] board) {
    int length = board.length;
    int width = board[0].length;
    //null or meet the wall
    if (board[0][0] == null || board[length - 1][width - 1] == null || board[0][0].equals("#") || board[length - 1][width - 1].equals("#")){
      System.out.println("could not reach the destination point");
      return -1;
    }

    //定义是否被访问
    boolean[][] visited = new boolean[length][width];
    visited[0][0] = true;

    //queue记录被放入的节点，并放入初始节点
    Queue<int[]> queue = new LinkedList<>();
    queue.offer(new int[]{0,0});

    //距离队列
    Queue<Integer> distance = new LinkedList<>();
    distance.offer(0);

    //定义坐标增量数组
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {-1, 0, 1, 0};

    //向队列中加入节点 int[]{nx, ny} 表示其位置
    while (!queue.isEmpty()) {
     int dist = distance.poll();
     int[] cur = queue.poll();
     int x = cur[0];
     int y = cur[1];

     //判断到达终点
     if (x == width - 1 && y == length - 1) {
       return dist;
     }
     //判断相邻节点是否为"."


    }

    return -1;
  }

  /**
   * 最短路径solution: DFS 深度优先搜索
   * @param board 地图
   * @return 最短路径长度
   */
  public int DFS(String[][] board) {
    return -1;
  }

  public static void main(String[] args) {

  }
}
