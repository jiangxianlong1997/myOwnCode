package MyLeetCodeExersice.DataStructure;

//定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
//
//
//
// 示例:
//
// 输入: 1->2->3->4->5->NULL
//输出: 5->4->3->2->1->NULL
//
//
//
// 限制：
//
// 0 <= 节点个数 <= 5000
//
public class Offer24 {
  public ListNode reverseList(ListNode head) {
    ListNode pre = null;
    ListNode cur = head;
    while (cur != null) {
      ListNode next = cur.next;
      cur.next = pre;
      pre = cur;
      cur = next;
    }
    return pre;
  }

  public static void main(String[] args) {
    ListNode head = new ListNode();
    ListNode node = new ListNode();
    head.next = node;
    head.val = 1;
    ListNode node1 = new ListNode();
    node.next = node1;
    node.val = 2;
    node1.val = 3;
    node1.next = null;
    Offer24 offer24 = new Offer24();
    offer24.reverseList(head);
  }

}
