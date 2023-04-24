package 培训.javaCollection.MapAndSet.StudentPack;

import java.util.ArrayList;

public class Class {
    private int class_id;
    private ArrayList<Student> arrayList = new ArrayList<>();

    public Class(int class_id) {
        this.class_id = class_id;
    }

    public ArrayList<Student> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Student> arrayList) {
        this.arrayList = arrayList;
    }

    public void addStudent(Student s) {
        arrayList.add(s);
    }

    public int totalAge() {
        int sum = 0;
        for (Student student:
                arrayList) {
            sum += student.getAge();
        }
        return sum;
    }

    public int avgAge() {
        return totalAge()/arrayList.size();
    }

    public int avgScore() {
        int sum = 0;
        for (Student student:
                arrayList) {
            sum += student.getScore();
        }
        return sum/arrayList.size();
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }
}
