package 培训期间excercise.lambda;

public class TestLambda {

  Runnable runnable = () -> {
    System.out.println();
  };

  Runnable runnable1 = System.out::println;

}
