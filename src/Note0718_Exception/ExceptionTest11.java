package Note0718_Exception;
/*
finally语句：
    放在finally语句块中的代码是一定会执行的【再次强调！！！】
    如果发生异常 只有"catch"了 下一个语句才能执行。
 */
public class ExceptionTest11 {
    public static void main(String[] args) {
        /*
        以下代码的执行顺序：
            先执行try...
            再执行finally...
            最后执行return（return语句只要执行方法必然结束。）
         */
        try{
            System.out.println("try...");
            return;
        }finally {
            //finally中的语句会执行。能执行到。
            System.out.println("finally...");
        }
        //这里不能写语句，因为这个代码是无法执行到的。return;
        //System.out.println("Hello World!");
    }
}
