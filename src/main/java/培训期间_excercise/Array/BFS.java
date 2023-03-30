package 培训期间_excercise.Array;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

  /**
   * 这个bfs访问的是graph的第target行的第一个1
   * @param graph
   * @param start
   * @param target
   */
  public static void bfs(int[][] graph, int start, int target) {
    //创建队列和标记数组，用于记录访问过的节点和需要访问的节点
    Queue<Integer> queue = new LinkedList<>();
    boolean[] visited = new boolean[graph.length];
    //加入起点
    queue.offer(start);
    visited[start] = true;

    //对队列中所有节点遍历
    while (!queue.isEmpty()) {
      //取出队列头结点
      int node = queue.poll();

      //如果找到目标节点，return
      if (node == target) {
        System.out.println("get the target.");
        return;
      }

      //遍历当前节点的邻居节点，如果没有则加入队列
      for (int i = 0; i < graph.length; i++) {
        if (graph[node][i] == 1 && !visited[i]) {
          queue.offer(i);
          System.out.println(queue);
          visited[i] = true;
          System.out.println("node : " + node + " i: " + i);
        }

        }
      }
    // 如果队列为空仍然没有找到目标节点，输出结果并结束程序
    System.out.println("Target node not found!");
  }


  public static void main(String[] args) {
    // 定义一个邻接矩阵表示的图
//    int[][] graph = new int[][]{
//        {0, 1, 1, 0, 0},
//        {1, 0, 0, 1, 0},
//        {1, 0, 0, 1, 1},
//        {0, 1, 1, 0, 1},
//        {0, 0, 1, 1, 0}
//    };
    int[][] graph = new int[][]{
        {1, 1, 0, 1 ,1},
        {1, 0, 0, 1, 0},
        {1, 0, 0, 1, 1},
        {0, 1, 1, 0, 1},
        {0, 0, 1, 1, 0}
    };

    // 调用 BFS 算法，并指定起点和目标节点
    bfs(graph, 0, 6);

  }

}

