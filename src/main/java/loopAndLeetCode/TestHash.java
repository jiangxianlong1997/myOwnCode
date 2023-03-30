package loopAndLeetCode;

import java.util.HashSet;
import java.util.Set;

public class TestHash<T> {

  public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();
    set.add(1);
    set.add(213);
    TestHash testHash = new TestHash();
    testHash.testHashCode(set);
    Set<Integer> set1 = new HashSet<>();
    set1.add(2);
    System.out.println(set1.hashCode());
  }

  public void testHashCode(Set<T> set) {
    System.out.println(set.hashCode());
  }

}
