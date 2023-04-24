package 培训.javaCollection.HomeWork;

/**
 * 题一：
 * 根据<<用户管理系统>>需求，设计User类，保存用户信息，
 * 属性有：id（编号）、username、password、email、role（角色，管理员或普通用户）
 * 题二：
 * 模仿DVD项目，创建一个Database类，完成User的增删改查操作（登录等，根据文档需求自己添加方法），
 * Map集合的键可以是用户id或username
 * 题三：
 * 创建一个Menu类，编写打印主菜单和不同权限用户的分菜单
 * 题四：
 * 创建View（界面）类，实现用户登录功能（根据用户输入的用户名和密码，判断是管理员还是普通用户，显示不同的菜单）
 * 题一：
 * 接昨天作业，实现普通用户的“修改自己信息”和“查询自己信息的功能”
 * 题二：
 * 实现管理员“添加用户”、“修改用户”、“删除用户功能”
 * 接昨天作业，实现管理员的“查询菜单”及相应功能
 */
public abstract class User {
    private String id;
    private String userName;
    private String password;
    private String email;
    private String roll;

    public User(String id, String userName, String password, String email, String roll) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.roll = roll;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }
}
