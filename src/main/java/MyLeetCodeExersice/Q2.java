package MyLeetCodeExersice;

//给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
//
// 请你将两个数相加，并以相同形式返回一个表示和的链表。
//
// 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
//
//
//
// 示例 1：
//
//
//输入：l1 = [2,4,3], l2 = [5,6,4]
//输出：[7,0,8]
//解释：342 + 465 = 807.
//
//
// 示例 2：
//
//
//输入：l1 = [0], l2 = [0]
//输出：[0]
//
//
// 示例 3：
//
//
//输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//输出：[8,9,9,9,0,0,0,1]
//
//
//
//
// 提示：
//
//
// 每个链表中的节点数在范围 [1, 100] 内
// 0 <= Node.val <= 9
// 题目数据保证列表表示的数字不含前导零
//
//
// Related Topics 递归 链表 数学 👍 9377 👎 0

//leetcode submit region begin(Prohibit modification and deletion)

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {}
 * ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
 * this.next = next; } }
 */
class Q2 {

  /**
   * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode(int
   * x) { val = x; } }
   */
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }
    ListNode result = new ListNode();
//    while (l1.next != null &&) {
//
//    }
    return null;
  }
}


class ListNode {

  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public void add(int data) {
    ListNode newNode = new ListNode(data);
    if (next == null) {
      next = newNode;
    } else {
      ListNode current = next;
      while (current.next != null) {
        current = current.next;
        //System.out.println(current.val);
      }
      current.next = newNode;
    }
  }

  void print() {
    if (next == null) {
      System.out.println("in");
      return;
    }
    ListNode current = next;
    while (current != null) {
      System.out.println(current.val);
      current = current.next;

    }
  }

}

//leetcode submit region end(Prohibit modification and deletion)
