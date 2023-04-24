package 培训.javaCollection.HomeWork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private DataBase dataBase;
    private String userName;

    public Menu(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void systemMenu() {
        System.out.println("用户登录-------1");
        System.out.println("用户注册-------2");
        System.out.println("退出程序-------3");
        try {
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            if (input == 1) {
                System.out.print("输入用户名：");
                Scanner nameScanner = new Scanner(System.in);
                String username = nameScanner.next();
                System.out.print("输入密码：");
                Scanner passwordScanner = new Scanner(System.in);
                String password = passwordScanner.next();
                for (User user:
                     dataBase.getList()) {
                    if (username.equals(user.getUserName()) && password.equals(user.getPassword()) && user.getRoll().equals("admin")) {
                        this.setUserName(username);
                        adminMenu();
                    } else if (username.equals(user.getUserName()) && password.equals(user.getPassword()) && user.getRoll().equals("normal")) {
                        this.setUserName(username);
                        userMenu();
                    }
                }
                System.out.println("Invalid name or password");
                systemMenu();
            } else if (input == 2) {
                System.out.print("username: ");
                Scanner nameS = new Scanner(System.in);
                String name = nameS.next();
                for (User user:
                     dataBase.getList()) {
                    if (user.getUserName().equals(name)) {
                        System.out.println("Duplicated username");
                        systemMenu();
                    }
                }
                System.out.print("password: ");
                Scanner pwS = new Scanner(System.in);
                String pw = pwS.next();
                System.out.print("id: ");
                Scanner idS = new Scanner(System.in);
                String id = idS.next();
                for (User user:
                        dataBase.getList()) {
                    if (user.getId().equals(id)) {
                        System.out.println("Duplicated id");
                        systemMenu();
                    }
                }
                System.out.print("email: ");
                Scanner eS = new Scanner(System.in);
                String email = eS.next();
                System.out.print("roll: ");
                Scanner rS = new Scanner(System.in);
                String roll = rS.next();
                if (roll.equals("admin")) {
                    dataBase.addUser(new Admin(id,name,pw,email,roll));
                    System.out.println("注册成功");
                    systemMenu();
                } else if (roll.equals("normal")) {
                    dataBase.addUser(new NormalUser(id,name,pw,email,roll));
                    System.out.println("注册成功");
                    systemMenu();
                } else {
                    System.out.println("Invalid roll");
                    systemMenu();
                }
            } else if (input == 3) {
                System.exit(0);
            } else {
                System.out.println("Invalid input please input again.");
                systemMenu();
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input please input again.");
            systemMenu();
        }
    }

    public void adminMenu() {
        System.out.println("添加用户-------1");
        System.out.println("删除用户-------2");
        System.out.println("修改用户-------3");
        System.out.println("查询用户-------4");
        System.out.println("退出程序-------5");
        System.out.println("sddf-6");
        try {
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            switch (input){
                case 1:
                    System.out.print("username: ");
                    Scanner nameS = new Scanner(System.in);
                    String name = nameS.next();
                    for (User user:
                            dataBase.getList()) {
                        if (user.getUserName().equals(name)) {
                            System.out.println("Duplicated username");
                            adminMenu();
                        }
                    }
                    System.out.print("password: ");
                    Scanner pwS = new Scanner(System.in);
                    String pw = pwS.next();
                    System.out.print("id: ");
                    Scanner idS = new Scanner(System.in);
                    String id = idS.next();
                    for (User user:
                            dataBase.getList()) {
                        if (user.getId().equals(id)) {
                            System.out.println("Duplicated id");
                            adminMenu();
                        }
                    }
                    System.out.print("email: ");
                    Scanner eS = new Scanner(System.in);
                    String email = eS.next();
                    System.out.print("roll: ");
                    Scanner rS = new Scanner(System.in);
                    String roll = rS.next();
                    if (roll.equals("admin")) {
                        dataBase.addUser(new Admin(id,name,pw,email,roll));
                        System.out.println("添加成功");
                        adminMenu();
                    } else if (roll.equals("normal")) {
                        dataBase.addUser(new NormalUser(id,name,pw,email,roll));
                        System.out.println("添加成功");
                        adminMenu();
                    } else {
                        System.out.println("Invalid roll");
                        adminMenu();
                    }
                case 2:
                    System.out.print("Please input the id of user you want to delete: ");
                    Scanner scanner1 = new Scanner(System.in);
                    String id_select = scanner1.next();
                    for (User user:
                         dataBase.getList()) {
                        if (user.getId().equals(id_select)) {
                            dataBase.deleteUser(user);
                            System.out.println("delete successful");
                            adminMenu();
                        }
                    }
                    System.out.println("Do not have this id in the database");
                    adminMenu();
                case 3:
                    System.out.println("Please input the username you want to change password: ");
                    Scanner scanner2 = new Scanner(System.in);
                    String name_select = scanner2.next();
                    System.out.println("Please input the new password: ");
                    Scanner scanner3 = new Scanner(System.in);
                    String newPs = scanner3.next();
                    for (User user:
                         dataBase.getList()) {
                        if (user.getUserName().equals(name_select)) dataBase.changeUserPassword(user,newPs);
                        System.out.println("Change successful");
                        adminMenu();
                    }
                    System.out.println("Do not have this username in the database");
                    adminMenu();
                case 4:
                    System.out.println("Please input the username you want to search: ");
                    Scanner scanner4 = new Scanner(System.in);
                    String name_input = scanner4.next();
                    for (User user:
                            dataBase.getList()) {
                        if (user.getUserName().equals(name_input)) {
                            System.out.println("有");
                            adminMenu();
                        }
                    }
                    System.out.println("没有");
                    adminMenu();
                case 5:
                    System.exit(0);
                case 6:
                    systemMenu();
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input please input again.");
            adminMenu();
        }

    }

    public void userMenu() {
        System.out.println("修改自己的信息--1");
        System.out.println("查询自己的信息--2");
        System.out.println("退出程序-------3");
        try {
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            switch (input){
                case 1:
                    System.out.println("Please input the new password: ");
                    Scanner scanner1 = new Scanner(System.in);
                    String newPs = scanner1.next();
                    for (User user:
                            dataBase.getList()) {
                        if (user.getUserName().equals(this.getUserName())) dataBase.changeUserPassword(user,newPs);
                        System.out.println("Change successful");
                        userMenu();
                    }
                    System.out.println("Do not have this username in the database");
                    userMenu();
                case 2:
                    for (User user:
                         dataBase.getList()) {
                        if (user.getUserName().equals(this.getUserName())) {
                            System.out.println("name: " + user.getUserName());
                            System.out.println("id: " + user.getId());
                            System.out.println("email: " + user.getEmail());
                            System.out.println("password: " + user.getPassword());
                            System.out.println("roll: " + user.getRoll());
                            System.out.println("查询成功,请继续操作");
                            userMenu();
                        }
                    }
                case 3:
                    System.exit(0);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input please input again.");
            userMenu();
        }
    }
}
