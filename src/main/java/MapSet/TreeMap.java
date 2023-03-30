package MapSet;

public class TreeMap {

  private Node root;

  public int size() {
    return size(root);
  }

  private int size(Node x) {
    if (x == null) {
      return 0;
    } else {
      return x.size;
    }
  }

  public Object get(int key) {
    Node x = root;
    while (x != null) {
      if (key < x.key) {
        x = x.left;
      } else if (key > x.key) {
        x = x.right;
      } else {
        return x.value;
      }
    }
    return null;
  }

  public void put(int key, Object value) {
    root = put(root, key, value);
  }

  private Node put(Node x, int key, Object value) {
    if (x == null) {
      return new Node(key, value, 1);
    }
    if (key < x.key) {
      x.left = put(x.left, key, value);
    } else if (key > x.key) {
      x.right = put(x.right, key, value);
    } else {
      x.value = value;
    }
    x.size = 1 + size(x.left) + size(x.right);
    return x;
  }

  private class Node {

    private final int key;
    private Object value;
    private Node left, right;
    private int size;

    public Node(int key, Object value, int size) {
      this.key = key;
      this.value = value;
      this.size = size;
    }
  }


}
