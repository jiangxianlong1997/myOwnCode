package MyLeetCodeExersice;
//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。

// 示例 1：
// 输入：head = [1,3,2]
// 输出：[2,3,1]

// 限制：
// 0 <= 链表长度 <= 10000
// Related Topics 栈 递归 链表 双指针 👍 414 👎 0

import java.util.Stack;

public class Offer06 {
  public int[] reversePrint(ListNode head) {
    Stack<Integer> stack = new Stack<>();
    while (head != null) {
      stack.push(head.val);
      head = head.next;
    }
    int size = stack.size();
    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
      System.out.println(arr[i] = stack.pop());
    }
    return arr;
  }

  public static void main(String[] args) {
    ListNode head = new ListNode();
    head.val = 1;

    ListNode node1 = new ListNode();
    head.next = node1;
    node1.val = 3;
    ListNode node2 = new ListNode();
    node1.next = node2;
    node2.val = 2;
    node2.next = null;
    Offer06 offer06 = new Offer06();

    int[] ints = offer06.reversePrint(head);
//    for (int anInt : ints) {
//      System.out.println(anInt);
//    }
  }

}

