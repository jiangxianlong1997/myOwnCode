package 培训.javaCollection.MapAndSet;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map.Entry;
import java.util.Scanner;

public class Exercise {
    public static HashMap<Integer, String> createMap() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(2016, "a");
        map.put(2002, "b");
        map.put(1998, "c");
        map.put(1994, "b");
        map.put(1990, "d");
        map.put(1986, "e");
        map.put(1982, "a");
        map.put(1978, "e");
        map.put(1974, "d");
        return map;
    }

    public static void team(HashMap<Integer, String> map) {
        System.out.print("input the year: ");
        Scanner scanner = new Scanner(System.in);
        try {
            int year = scanner.nextInt();
            System.out.println(map.getOrDefault(year, "No world cup this year"));
        } catch (InputMismatchException e) {
            System.out.println("illegal input, please input again");
            team(createMap());
        }
    }

    public static void year(HashMap<Integer, String> map) {
        System.out.print("input the team: ");
        Scanner scanner = new Scanner(System.in);
        try {
            String team = scanner.next();
            int counter = 0;
            for (Entry<Integer, String> entry :
                    map.entrySet()) {
                if (entry.getValue().equals(team)) {
                    System.out.print(entry.getKey() + " ");
                    counter++;
                }
            }
            if (counter == 0) {
                System.out.println("Do not have this team");
            }
            System.exit(0);
//      System.out.println("Do not have this team");
        } catch (InputMismatchException e) {
            System.out.println("illegal input, please input again");
            year(createMap());
        }

    }

    /**
     * 1） 使用一个Map，以老师的名字作为键，以老师教授的课程名作为值，表示上述
     * 课程安排。
     * 2） 增加了一位新老师Allen 教JDBC
     * 3） Lucy 改为教CoreJava   put方法
     * 4） 遍历Map，输出所有的老师及老师教授的课程
     * 5） 利用Map，输出所有教JSP 的老师
     */
    public static void teach() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Tom", "CoreJava");
        map.put("John", "Oracle");
        map.put("Susan", "Oracle");
        map.put("Jerry", "JDBC");
        map.put("Jim", "Unix");
        map.put("Kevin", "JSP");
        map.put("Lucy", "JSP");
        map.put("Allen", "JDBC");
        map.replace("Lucy", "CoreJava");
        map.forEach((s, s2) -> System.out.println(s + " " + s2));

        System.out.println("----------------------");
//        Iterator<String> iterator = map.keySet().iterator();
//        while (iterator.hasNext()) {
//            String next = iterator.next();
//            if (map.get(next).equals("JSP")) System.out.println(next);
//        }
        final boolean[] b = {false};
        map.forEach((s, s2) -> {
            if (s2.equals("Oracle")) {
                System.out.println(s);
                b[0] = true;
            }
        });
        if (!b[0]) {
            System.out.println("Do not have this kind of teacher");
        }

    }

    public static <T> void printArray (T[] inputArray) {
        for (T t:
             inputArray) {
            System.out.println(t);
        }
    }


    public static void main(String[] args) {
//    team(createMap());
//    year(createMap());
        teach();
//        printArray(new Integer[]{1,2,3});
    }
}
