package 培训期间_excercise.DataStructure.List;

public class LinkedList {

  private Node head;
  private int size;

  public LinkedList() {
    head = null;
    size = 0;
  }

  public void add(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
    } else {
      Node current = head;
      while (current.getNext() != null) {
        current = current.getNext();
      }
      current.setNext(newNode);
      size++;
    }
  }

  public void insertAfterNode(Node node, int data) {
    Node newNode = new Node(data);
    newNode.setNext(node.getNext());
    node.setNext(newNode);
    size++;
  }

  public void deleteNode(Node node) {
    if (head == null) {
      return;
    }
    if (head == node) {
      head = node.getNext();
      return;
    }
    node.setData(node.getNext().getData());
    node.setNext(node.getNext().getNext());
    //while (prev.getNext() != null && )
    size--;
  }

  public void printNode() {
    if (head == null) {
      return;
    }
    Node current = head;
    while (current != null) {
      System.out.println(current.getData());
      current = current.getNext();
    }
  }

  // find the first node with the required data value
  public Node getNode(int data) {
    Node current = head;
    while (current != null) {
      if (current.getData() == data) {
        return current;
      }
      current = current.getNext();
    }
    return null;
  }

  // update first listNode with input value
  public void update(int ori, int upd) {
    if (head == null) {
      return;
    }
    Node current = head;
    while (current != null) {
      if (current.getData() == ori) {
        current.setData(upd);
      }
      current = current.getNext();
    }
  }

  public Node find(int val) {
    if (head == null) {
      return null;
    }
    Node current = head;
    while (current != null) {
      if (current.getData() == val) {
        return current;
      }
      current = current.getNext();
    }
    return null;
  }


}
