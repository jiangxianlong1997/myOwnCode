package 培训.javaCollection;

import java.util.Arrays;

public class TestPackagingClass {

  public static void main(String[] args) {
//    Byte b999 = new Byte((byte) 12);
    Byte b = 12;
    byte b1 = b;


    String string = Integer.toString(10);
    System.out.println(string);
    int i = Integer.parseInt(string);
    System.out.println(i);
    System.out.println(Integer.MAX_VALUE);
    String s1 = "123";
    String s2 = "123";
    System.out.println(s1 == s2);
    String s3 = new String("123");
    String s4 = new String("123");
    String s5 = new String("1232123");
    System.out.println(s3 == s4);
    System.out.println(s3.equals(s4));
    System.out.println(s5.lastIndexOf("2"));
    System.out.println(s5.substring(3,5).indexOf("2"));
    System.out.println(s5.subSequence(3,5));
    System.out.println( String.join("-","anc","ds","ds"));
    String s = " a b  ";
    System.out.println(s.strip());
    String s6 = " a b c d f  f ";
    System.out.println(s6.stripLeading());
    System.out.println(s6.replaceAll(" ", ""));
    System.out.println(String.format(s6 + 1));
    for (char c: s6.replaceAll(" ","").toCharArray()
    ) {
      System.out.println(c);
    }
    System.out.println(s.repeat(3));
    System.out.println(Arrays.toString(s6.split(" ")));



  }




}
