package 培训期间_excercise.Array;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Demo {

  public static void main(String[] args) {
    Queue<String> queue = new LinkedList<>();
    queue.offer("a");
    queue.offer("b");
    queue.offer("c");
    //删除队头元素
    queue.poll();
    queue.forEach(System.out::println);
    //peek() 选择队列头元素
    System.out.println(queue.peek());
    queue.forEach(System.out::println);
//    ArrayList<Integer> arrayList = new ArrayList<>();
//    arrayList.ensureCapacity(20);

  }

}
