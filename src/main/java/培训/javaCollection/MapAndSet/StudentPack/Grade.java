package 培训.javaCollection.MapAndSet.StudentPack;

import java.util.ArrayList;
import java.util.HashMap;

public class Grade {
    HashMap<Integer,Class> map = new HashMap<>();

    public void addClasses(Class... classes) {
        for (Class c:
             classes) {
            map.put(c.getClass_id(),c);
        }
    }

    public int getAllStudentAvgAge() {
        if (map.size() == 0) return -1;
        int total = 0;
        for (Class c:
             map.values()) {
            total += c.totalAge();
        }
        return total/map.size();
    }
    public int gradeAvgScore() {
        if (map.size() == 0) return -1;
        int total = 0;
        for (Class c:
             map.values()) {
            total += c.avgScore();
        }
        return total/map.size();
    }

    public ArrayList<Integer> getAllClassAvgScore() {
        ArrayList<Integer> list = new ArrayList<>();
        for (Class c:
                map.values()) {
           list.add(c.avgScore());
        }
        return list;
    }

    public static void main(String[] args) {
        Grade grade = new Grade();
        ClassFactory classFactory = new ClassFactory();
        Class class1 = classFactory.create(1,new Student("a",1,50, "1"),new Student("b",10,60, "1"),new Student("c",15,70, "1"),new Student("d",16,80, "1"));
        Class class2 = classFactory.create(2,new Student("e",19,90, "2"),new Student("f",20,100, "2"));
        grade.addClasses(class1,class2);
        System.out.println("all student avg age: " + grade.getAllStudentAvgAge());
        System.out.println("grade avg Score: " + grade.gradeAvgScore());
        System.out.println(grade.getAllClassAvgScore());
    }
}
