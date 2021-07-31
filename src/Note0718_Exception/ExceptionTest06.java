package Note0718_Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
处理异常的第一种方式：在方法声明的位置上使用throws关键字抛出，谁调用我这个方法，我就抛给谁。抛给调用者来处理。
注意：
    只要异常没有捕捉，采用上报的方法时，此方法的后续代码不会执行。
    另外需要注意，try语句块中的某一行出现异常，该行后面的代码不会执行。
    try..catch捕捉异常之后，后续代码可以执行。

在以后的开发中，处理编译时异常，应该上报还是捕捉呢，怎么选？
    如果希望调用者来处理，选择throws上报。
    其它的情况使用捕捉的方式。
 */
public class ExceptionTest06 {
    //一般不建议在main方法上使用throws，因为这个异常如果真正的发生了，一定会抛给JVM。JVM只有终止。
    //异常处理机制的作用就是增强程序的健壮性。怎么能做到，异常发生了也不影响程序的执行。所以
    //一般main方法中的异常建议使用try..catch进行捕捉。main就不要继续上抛了。

    //public static void main(String[] args) throws FileNotFoundException {
    public static void main(String[] args) {
        //100/0这是算术异常，这个异常是运行时异常，你在编译阶段，可以处理，也可以不处理。编译器不管。
        //System.out.println(100/0);
        /*try{
            System.out.println(100/0);
        }catch (ArithmeticException e){
            System.out.println("算数异常了！！！！");
        }*/
        System.out.println("main begin");
        try {
            //try尝试
            m1();
            //以上代码出现异常，直接进入catch语句块中执行。
        } catch (FileNotFoundException e) {//catch后面的好像一个方法的形参。
            //这个分支中可以使用e引用，e引用保存的内存地址是那个new出来异常对象的内存地址。
            //catch是捕捉异常之后走的分支。
            //在catch分支中干什么？处理异常。
            System.out.println("文件不存在，可能路径错误，也可能该文件被删除了！");
        }
        //try..catch把异常抓住之后，这里的代码会继续执行。
        System.out.println("main over");
    }
    private static void m1() throws FileNotFoundException {
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");
    }
    //抛别的不行，抛ClassCastException说明你还是没有对FileNoteFoundException进行处理
    //private static void m2() throws ClassCastException{
    //抛FileNotFoundException的父对象IOException，这样是可以的。因为IOException包括FileNotFoundException
    //private static void m2() throws IOException{
    //这样也可以因为Exceptio包括所有的异常。
    //private static void m2() throws Exception{
    //throws后面也可以写多个异常，可以使用逗号隔开。
    //private static void m2() throws FileNotFoundException,ClassCastException{
    private static void m2() throws FileNotFoundException{
        System.out.println("m2 begin");
        //编译器报错原因：m3()方法声明位置上有：throws FileNotFoundException
        //我们在这里调用m3()没有对异常进行预处理，所以编译报错。
        //m3();
        m3();
        System.out.println("m2 over");
    }
    private static void m3() throws FileNotFoundException {
        //调用SUN jdk中某个类的构造方法。
        //这个类还没有接触过，后期IO流的时候就知道了。
        //我们只是借助这个类学习一下异常处理机制。
        //创建一个输入流对象，该流指向一个文件。
        /*
        编译报错的原因是什么？
            第一：这里调用了一个构造方法
            第二：这个构造方法的声明位置上有：throws FileNotFoundException
            第三：通过类的继承结构看到FileNoteFoundException父类是IOException，IOException的父类是Exception，
            最终得知：FileNoteFoundException是编译时异常

            错误原因？编译时异常要求程序员编写程序阶段必须对它进行处理，不处理编译器就报错。
         */
        //new FileInputStream("")

        //我们采用第一种处理方式：在方法声明的位置上使用throws继续上抛。
        //一个方法体当中的代码出现异常之后，如果上报的话，此方法结束。
        new FileInputStream("C:\\Users\\86156\\Desktop\\JavaBilibili\\重点.txt");
    }

}
