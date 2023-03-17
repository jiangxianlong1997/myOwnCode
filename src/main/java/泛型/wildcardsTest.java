package 泛型;

import java.util.ArrayList;
import java.util.List;

public class wildcardsTest {
  static int countLegs (List<? extends Animal > animals ) {
    int retVal = 0;
    for ( Animal animal : animals )
    {
      retVal += animal.getLeg();
    }
    return retVal;
  }

  static int countLegs1 (List< Animal > animals ){
    int retVal = 0;
    for ( Animal animal : animals )
    {
      retVal += animal.getLeg();
    }
    return retVal;
  }

  private static <T> void test(List<? super T> dst, List<T> src){
    for (T t : src) {
      dst.add(t);
    }
  }

  public static void main(String[] args) {
    List<Dog> dogs = new ArrayList<>();
    List<Animal> animals = new ArrayList<>();
    dogs.add(new Dog("a",2));
    dogs.add(new Dog("b",34));

    // 不会报错
    System.out.println(countLegs(dogs));

    // 报错
    //countLegs1(dogs);
    test(animals,dogs);
    System.out.println(animals.size());
  }

}
