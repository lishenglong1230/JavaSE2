package Note0718_Exception;
/*
异常对象有两个非常重要的方法：
    获取异常简单的描述信息：
        String msg=exception.getMessage();
    打印异常追踪的堆栈信息：
        exception.printStackTrace();
 */
public class ExceptionTest08 {
    public static void main(String[] args) {
        NullPointerException e= new NullPointerException("空指针异常");
        //throw e;手动抛异常
        String msg=e.getMessage();
        //获取一场简单描述信息：这个信息实际上就是构造方法上面String参数。
        System.out.println(msg);

        //打印异常堆栈信息
        //java后台打印异常堆栈追踪信息的时候，采用了异步线程的方式打印的。
        e.printStackTrace();
        System.out.println("Hello World!");
    }
}
