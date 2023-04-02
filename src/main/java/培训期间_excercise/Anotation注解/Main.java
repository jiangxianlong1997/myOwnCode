package 培训期间_excercise.Anotation注解;

import java.lang.reflect.Method;

public class Main {
  public static void main(String[] args) {
    MyClass obj = new MyClass();
    Class<? extends MyClass> clazz = obj.getClass();
    Method method = null;
    try {
      method = clazz.getMethod("myMethod");
      MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
      System.out.println(annotation.name()); // 输出：myMethod
      System.out.println(annotation.value()); // 输出：10
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    }
  }
}
