package Note0718_Exception.ExceptionTest15;

public class ExceptionTest15 {
    public static void main(String[] args) {
        //创建异常对象（只new了异常对象，并没有手动抛出）
        MyException e = new MyException("用户名不能为空！");

        //打印异常堆栈信息
        e.printStackTrace();//Note0718_Exception.MyException: 用户名不能为空！
                            //at Note0718_Exception.ExceptionTest15.main(ExceptionTest15.java:6)

        //获取异常简单描述信息
        String msg=e.getMessage();
        System.out.println(msg);//用户名不能为空！
    }
}

