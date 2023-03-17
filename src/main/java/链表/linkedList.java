package 链表;

public class linkedList<T> {

  private Node head;
  private int size;
  public linkedList() {
    this.head = null;
    this.size = 0;
  }



  public int getSize() {
    return this.size;
  }

  public boolean isEmpty() {
    return this.size == 0;
  }

  public void addFirst(T t) {
    Node node = new Node(t);
    node.next = this.head;
    this.head = node;
    this.size++;
  }

  public void add(T t, int index){
    if (index < 0 || index > size) {
      throw new IllegalArgumentException("wrong index");
    }
    if (index == 0) {
      this.addFirst(t);
      return;
    }
    Node preNode = head;
    for(int i = 0; i < index - 1; i++) {
      preNode = preNode.next;
    }
    Node node = new Node(t);
    node.next = preNode.next;
    preNode.next = node;
    this.size++;
  }

  public void addLast(T t) {
    //Node node = new Node(t);
    this.add(t, this.size);
  }

  public boolean contain(T t){
    Node current = this.head;
    while(current != null) {
      if(current.data.equals(t)){
        return true;
      }
      current = current.next;
    }
    return false;
  }

  public void remove(T t) {
    if(!contain(t)){
      return;
    }
    Node pre = this.head;
    while(pre.next != null) {
      if(pre.next.data.equals(t)){
        pre.next = pre.next.next;
      }
      pre = pre.next;
    }
    this.size--;
  }

  public void removeFirst() {
    if(head == null) {
      return;
    }
    this.head = head.next;
    this.size--;
  }

  public void removeLast() {
    if(head == null) {
      return;
    }
    if(size == 1) {
      removeFirst();
    }
    Node node = head;
    for(int i = 0; i < size - 2; i++) {
      node = node.next;
    }
    node.next = null;
    this.size--;
  }


  @Override
  public String toString() {
    StringBuffer sb = new StringBuffer();
    Node current = this.head;
    while(current!= null) {
      sb.append(current.data + "->");
      current = current.next;
    }
    sb.append("Null");
    return sb.toString();
  }

  public class Node {

    private T data;
    private Node next;



    public Node(T t) {
      this.data = t;
    }
  }

  public static void main(String[] args) {
    linkedList<Integer> list = new linkedList();
    for (int i = 0; i < 10; i++) {
      list.addFirst(i);
    }
    System.out.println(list);
    list.add(10,5);
    System.out.println(list);
    list.addLast(11);
    System.out.println(list);
    System.out.println(list.contain(11));
    System.out.println(list.contain(0));
    list.remove(1);
    System.out.println(list);
    list.removeFirst();
    System.out.println(list);
    list.removeLast();
    System.out.println(list);
  }

}


