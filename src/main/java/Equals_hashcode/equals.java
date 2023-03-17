package Equals_hashcode;

public class equals {

//equals对内容比较， == 对地址比较
  @Override
  public int hashCode(){
    return 0;
  }

  public static void main(String[] args) {
//    ArrayList<Integer> list = new ArrayList<>();
//    list.add(1);
//    ArrayList<Integer> new_list = new ArrayList<>();
//    new_list.add(1);
//    System.out.println(list.equals(new_list));
//    System.out.println(list==new_list);
    int a = 1;
    String s = "12345";
    System.out.println(a);
    System.out.println(a++);
    System.out.println(a);
    System.out.println(s.substring(1,3));
  }

}
