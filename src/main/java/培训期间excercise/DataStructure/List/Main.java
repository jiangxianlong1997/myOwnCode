package 培训期间excercise.DataStructure.List;

public class Main {

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(2);
//    linkedList.printNode();
    linkedList.add(3);
    linkedList.printNode();
    linkedList.deleteNode(linkedList.getNode(2));
    System.out.println("After deleted");
    linkedList.printNode();
    System.out.println("update");
    linkedList.update(1, 4);
    linkedList.printNode();
    System.out.println("find");
    System.out.println(linkedList.find(10));
    System.out.println(linkedList.find(4));
    System.out.println(linkedList.find(4).getData());

  }

}
