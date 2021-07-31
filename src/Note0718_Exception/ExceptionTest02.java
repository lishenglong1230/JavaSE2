package Note0718_Exception;
/*
java语言中异常是以什么形式存在的呢？
    1、异常在java中以类的形式存在，每一个异常类都可以创建异常对象。
    2、异常对应的现实生活中是怎样的？
        类是：模板
        对象是：实际存在的个体。
 */
public class ExceptionTest02 {
    public static void main(String[] args) {
        //通过"异常类"实例化"异常对象"
        NumberFormatException nfe=new NumberFormatException("数字格式化异常！");
        //java.lang.NumberFormatException: 数字格式化异常！
        System.out.println(nfe);

        //通过"异常类"创建 "异常对象"
        NullPointerException npe=new NullPointerException("空指针异常发生了！");
        //java.lang.NullPointerException: 空指针异常发生了！
        System.out.println(npe);
    }
}
