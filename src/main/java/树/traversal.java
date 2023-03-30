package 树;

import java.util.ArrayList;
import java.util.List;

public class traversal<T> {

  private final List<T> list = new ArrayList<>();

  public void preorder(treeNode root) {
    if (root != null) {
      list.add(root.val);
      preorder(root.left);
      preorder(root.right);
    }
  }

  public class treeNode {

    private final T val;
    private treeNode left;
    private treeNode right;

    public treeNode(T value) {
      this.val = value;
    }

    @Override
    public String toString() {
      return "[" + val + "]";
    }
  }
}
