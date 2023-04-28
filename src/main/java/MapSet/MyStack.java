package MapSet;

import java.util.Stack;

public class MyStack {

  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    for (Integer i:
    stack) {
      System.out.println(i);
    }
    System.out.println("size" + stack.size());
    for (int i = 0; i < stack.size(); i++) {
      System.out.println(i);
      System.out.println(stack.pop());
    }

    }
  }

