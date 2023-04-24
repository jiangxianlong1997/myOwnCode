package MyLeetCodeExersice;

public class Main {

  public static void main(String[] args) {
//    ListNode node = new ListNode();
//    //node.next = new ListNode(1);
//    node.add(9);
//    node.add(9);
//    node.add(9);
//    node.add(9);
//    node.add(9);
//    node.add(9);
//    ListNode node1 = new ListNode();
//    node1.add(9);
//    node1.add(9);
//    node1.add(9);
//    node1.add(9);
//    node.print();
    Q1 q1 = new Q1();
    for (int i :q1.twoSum(new int[]{3,2,4},6)
    ) {
      System.out.println(i);
    }

  }
}
