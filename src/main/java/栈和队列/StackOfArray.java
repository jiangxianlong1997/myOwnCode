package 栈和队列;

public class StackOfArray<T> {

  private final int maxSize;
  private int stackTop;
  private final T[] stackArray;

  public StackOfArray(int size) {
    this.maxSize = size;
    stackTop = -1;
    stackArray = (T[]) new Object[maxSize];
  }

  public static void main(String[] args) {
    StackOfArray stack = new StackOfArray(10);
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.pop();
    System.out.println(stack);
    System.out.println(stack.peek());
  }

  public void push(T t) {
    stackArray[++stackTop] = t;
  }

  public void pop() {
    stackArray[stackTop--] = null;
//    stackArray[stackTop] = null;
//    stackTop--;
  }

  public T peek() {
    return stackArray[stackTop];
  }

  @Override
  public String toString() {
    StringBuffer sb = new StringBuffer();
    for (T t : stackArray) {
      sb.append(t);
    }
    return sb.toString();
  }

}
