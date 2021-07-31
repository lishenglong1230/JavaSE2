package Note0718_Exception.homework;

public class Test {
    public static void main(String[] args) {
        //创建UserService对象
        UserService userService = new UserService();
        //用户名和密码就不再从控制台接收了
        try {
            userService.register("jackson","123");
        } catch (IllegalNameException e) {
            System.out.println(e.getMessage());
        }
    }
}
