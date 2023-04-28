package MapSet;

import java.math.BigInteger;
import java.util.Random;

public class MyBig {

  public static void main(String[] args) {
    BigInteger bigInteger1 = new BigInteger("1120");
    System.out.println(bigInteger1);
    BigInteger bigInteger2 = new BigInteger("10101011",2);
    System.out.println(bigInteger2);
    BigInteger bigInteger3 = BigInteger.valueOf(16);
    BigInteger bigInteger4 = BigInteger.valueOf(16);
    System.out.println(bigInteger4 == bigInteger3);
    BigInteger bigInteger5 = BigInteger.valueOf(17);
    BigInteger bigInteger6 = BigInteger.valueOf(17);
    System.out.println(bigInteger5 == bigInteger6);
    BigInteger bigInteger7 = new BigInteger(4,new Random()); //2^4 的 random 0 ~ 15
    System.out.println(bigInteger7);
    //获取商和余数
    BigInteger bd1 = new BigInteger("10");
    BigInteger bd2 = new BigInteger("3");
    BigInteger[] bigIntegers = bd1.divideAndRemainder(bd2);
    System.out.println(bigIntegers[0]);
    System.out.println(bigIntegers[1]);
    System.out.println(bd1.intValue());
  }
}
