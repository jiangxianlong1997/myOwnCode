package 培训.Object.School;

public class TeacherSingleton {
  private static TeacherSingleton instance = new TeacherSingleton();

  private TeacherSingleton() {
  }

  public static TeacherSingleton getInstance() {
    return instance;
  }
}
