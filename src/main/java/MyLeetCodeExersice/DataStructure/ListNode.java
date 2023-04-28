package MyLeetCodeExersice.DataStructure;


 public class ListNode {

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

