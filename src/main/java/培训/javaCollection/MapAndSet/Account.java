package 培训.javaCollection.MapAndSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *（Map）设计Account 对象如下：（有三个属性，long id,double balance,String password）
 * 要求完善设计，使得该Account 对象能够自动分配id(可考虑使用从1970-1-1 0：0:0以来的毫秒数为id)。
 * 给定一个List 如下：
 * List list = new ArrayList();
 * list.add(new Account(10.00, “1234”));
 * list.add(new Account(15.00, “5678”));
 * list.add(new Account(0, “1010”));
 * 要求把List 中的内容放到一个Map 中，该Map 的键为id，值为相应的Account 对象。
 * 最后遍历这个Map，打印所有Account 对象的id 和余额。
 */


public class Account {
    private long id;
    private double balance;
    private String password;
    // 静态变量，记录当前最大的id值
    private static long maxId;

    static {
        // 静态代码块，初始化maxId
        maxId = System.currentTimeMillis();
    }


    public Account(double balance, String password) {
        this.id = maxId++;
        this.balance = balance;
        this.password = password;
    }

    public static void main(String[] args) {

        List<Account> list = new ArrayList<>();
        list.add(new Account(10.00, "1234"));
        list.add(new Account(15.00, "5678"));
        list.add(new Account(0.00, "1010"));
        HashMap<Long, Account> map = new HashMap<>();
        for (Account account:
             list) {
            map.put(account.id, account);
        }
        for (Map.Entry<Long, Account> entry:
             map.entrySet()) {
            System.out.println(entry.getValue().id + " " + entry.getValue().balance);
        }



    }

}

