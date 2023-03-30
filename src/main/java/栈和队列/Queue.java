package 栈和队列;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {

  private final List<T> list = new ArrayList<>();
  private int index;

  public static void main(String[] args) {

    //测试队列
    System.out.println("测试队列：");
    Queue queue = new Queue();
    queue.in(1);
    queue.in(2);
    queue.in(3);
    System.out.println(queue);
    queue.out();
    System.out.println(queue);
    queue.in(4);
    System.out.println(queue);
    queue.out();
    System.out.println(queue);
    queue.in(5);
    System.out.println(queue);

  }

  public void in(T t) {
    list.add(t);
    index++;
  }

  public void out() {
    if (index > 0) {
      list.remove(list.get(0));
      index--;
    }
  }

  @Override
  public String toString() {
    StringBuffer sb = new StringBuffer();
    for (T t : list) {
      sb.append(t);
    }
    return sb.toString();
  }


}
