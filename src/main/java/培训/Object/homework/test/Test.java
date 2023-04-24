package 培训.Object.homework.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test {

  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(1);
    arrayList.add(2);
    arrayList.add(3);
    for (Object  o: arrayList.toArray()
    ) {
      System.out.println(o);
    }
    HashMap<Integer,Integer> hashMap = new HashMap<>();
    hashMap.put(1,1);
    hashMap.put(3,3);
    System.out.println(hashMap.toString());
    System.out.println(hashMap.toString().charAt(2));
    HashSet<Integer> hashSet = new HashSet<>();
    hashSet.add(1);
    hashSet.add(3);
    hashSet.add(2);
    hashSet.forEach(System.out::println);
    for (Object o: hashSet.toArray()
    ) {
      System.out.println(o);
    }
    Queue<Integer> queue = new LinkedList<>();
    queue.poll();
    Stack<Integer> stack = new Stack<>();
  }

}
