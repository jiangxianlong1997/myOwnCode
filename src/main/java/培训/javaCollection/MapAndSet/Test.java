package 培训.javaCollection.MapAndSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class Test {

  public static void main(String[] args) {
    HashSet<Integer> hashSet = new HashSet<>();
    hashSet.add(5);
    hashSet.add(1);
    hashSet.add(2);
    hashSet.add(3);
    hashSet.add(4);
    hashSet.forEach(System.out::println);
//    for (Integer i: hashSet
//    ) {
//      hashSet.remove(i);
//      hashSet.add(i + 1);
//    }
//    System.out.println("After：");
//    hashSet.forEach(System.out::println);
    ArrayList<Student> list = new ArrayList<>();
    list.add(new Student(1,"abnc"));
    list.add(new Student(3,"sfdd"));
    list.add(new Student(2,"fsa"));
    list.add(new Student(4,"a"));
    System.out.println(Collections.max(list, new StudentComparatorById()));

    HashMap<Character, Integer> map = new HashMap<>();
    String s = "123124134feawfagafvagfew";
    for (int i = 0; i < s.length(); i++) {
      if (!map.containsKey(s.charAt(i))) {
        map.put(s.charAt(i), 1);
      } else {
        map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
      }
    }
    System.out.println(map);



  }
  static class StudentComparatorById implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
      Student student1 = (Student)o1;
      Student student2 = (Student)o2;
      return student1.getId() - student2.getId();
    }
  }

}

