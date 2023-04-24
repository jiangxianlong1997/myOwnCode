package 培训.javaCollection.MapAndSet.StudentPack;

public class ClassFactory {
    public Class create(int id, Student... student) {
        Class c = new Class(id);
        for (Student student1:
             student) {
            c.addStudent(student1);
        }
        return c;
    }
}
