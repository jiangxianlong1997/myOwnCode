package 培训.javaCollection.MapAndSet;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {

  public static void main(String[] args) {
    HashMap<Integer, String> hashMap = new HashMap<>();
    hashMap.put(1,"a");
    hashMap.put(2,"b");
    System.out.println(hashMap.containsValue("a"));
    System.out.println(hashMap.keySet());
    System.out.println(hashMap.values());
    Set<Entry<Integer, String>> set = hashMap.entrySet();
    for (Entry<Integer, String> entry:
    set) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

  }


}
