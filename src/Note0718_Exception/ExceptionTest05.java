package Note0718_Exception;

public class ExceptionTest05 {
    //第一种处理方式：在方法声明的位置上继续使用：throws，来完成异常的继续上抛。抛给调用者。
    /*
    public static void main(String[] args) throws ClassNotFoundException {
        doSome();
    }*/

    //第二种处理方式：try..catch进行捕捉
    public static void main(String[] args) {
        try {
            doSome();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void doSome() throws ClassNotFoundException{
        System.out.println("doSome!!!");
    }
}
