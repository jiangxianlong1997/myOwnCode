package 链表;

public class linkedListWriteByMe<T> {

  private Node head;
  private int size;

  public linkedListWriteByMe() {
    this.head = null;
    this.size = 0;
  }

  public static void main(String[] args) {
    linkedListWriteByMe linkedListWriteByMe = new linkedListWriteByMe();
    for (int i = 0; i < 5; i++) {
      linkedListWriteByMe.addFirst(i);
    }
    System.out.println(linkedListWriteByMe);
    linkedListWriteByMe.add(3, 6);
    System.out.println(linkedListWriteByMe);
    linkedListWriteByMe.addLast(7);
    System.out.println(linkedListWriteByMe);
    linkedListWriteByMe.change(3, 10);
    System.out.println(linkedListWriteByMe);
    System.out.println(linkedListWriteByMe.find(2).getValue());
    linkedListWriteByMe.remove(1);
    System.out.println(linkedListWriteByMe);
    linkedListWriteByMe.remove(0);
    System.out.println(linkedListWriteByMe);
    linkedListWriteByMe.remove(4);
    System.out.println(linkedListWriteByMe);
  }

  public int getSize() {
    return this.size;
  }

  public boolean isEmpty() {
    return this.size == 0;
  }

  public void addFirst(T t) {
    Node node = new Node(t);
    node.next = head;
    this.head = node;
    size++;
  }

  public void add(int index, T t) {
    if (index > size || index < 0) {
      throw new IllegalArgumentException("wrong index");
    }
    if (index == 0) {
      addFirst(t);
    }
    Node node = new Node(t);
    Node pre = head;
    for (int i = 0; i < index - 1; i++) {
      pre = pre.next;
    }
    node.next = pre.next;
    pre.next = node;
    size++;
  }

  public void addLast(T t) {
    Node node = new Node(t);
    Node per = head;
    for (int i = 0; i < size - 1; i++) {
      per = per.next;
    }
    per.next = node;
    size++;
  }

  public void change(int index, T t) {
    if (index > size || index < 0) {
      throw new IllegalArgumentException("wrong index");
    }
    Node node = head;
    if (size == 1) {
      node.setValue(t);
      head = node;
    }
    for (int i = 0; i < index; i++) {
      node = node.next;
    }
    node.setValue(t);
  }

  public Node find(int index) {
    Node node = head;
    for (int i = 0; i < index; i++) {
      node = node.next;
    }
    return node;
  }

  public void remove(int index) {
    if (index > size || index < 0) {
      throw new IllegalArgumentException("wrong index");
    }
    if (index == 0) {
      head = head.next;
      size--;
      return;
    }
    Node pre = head;
    for (int i = 0; i < index - 1; i++) {
      pre = pre.next;
    }
    pre.next = pre.next.next;
    this.size--;
  }

  @Override
  public String toString() {
    StringBuffer sb = new StringBuffer();
    Node node = head;
    for (int i = 0; i < size; i++) {
      sb.append(node.value + " ");
      node = node.next;
    }
    return sb.toString();
  }

  private class Node {

    private T value;
    private Node next;

    public Node(T value) {
      this.value = value;
      this.next = null;
    }

    public T getValue() {
      return this.value;
    }

    public void setValue(T value) {
      this.value = value;
    }
  }


}
