package Note0718_Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
深入try..catch
    1、catch后面的小括号中的类型可以是具体的异常类型，也可以是该异常类型的父类型。
    2、catch可以写多个。建议catch的时候，精确的一个一个处理。这样有利于程序的调试
    3、catch写多个的时候，从上到下，必须遵守从小到大。
 */
public class ExceptionTest07 {
    public static void main(String[] args) {
        /*try {
            FileInputStream fis=new FileInputStream("C:\\Users\\\\86156\\\\Desktop\\\\JavaBilibili\\\\重点.txt");
            System.out.println("以上出现异常，这里无法执行！");
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
        }
        System.out.println("hello world!");*/

        /*try {
            FileInputStream fis=new FileInputStream("C:\\Users\\86156\\Desktop\\JavaBilibili\\重点.txt");
        } catch (IOException e) {//多态：IOException e=new FileNoteFoundException();
            System.out.println("文件不存在！");
        }*/

/*        try {
            FileInputStream fis=new FileInputStream("C:\\Users\\86156\\Desktop\\JavaBilibili\\重点.txt");
        } catch (Exception e) {//多态：Exception e=new FileNoteFoundException();
            System.out.println("文件不存在！");
        }*/

        /*try {
            //创建输入流
            FileInputStream fis=new FileInputStream("C:\\Users\\86156\\Desktop\\JavaBilibili\\重点.txt");
            //读文件
            fis.read();
        } catch (Exception e) {//所有的异常都走这个分支。
            System.out.println("文件不存在！");
        }*/

        /*try {
            //创建输入流
            FileInputStream fis=new FileInputStream("C:\\Users\\86156\\Desktop\\JavaBilibili\\重点.txt");
            //读文件
            fis.read();
        } catch (FileNotFoundException e) {//所有的异常都走这个分支。
            System.out.println("文件不存在！");
        } catch (IOException e){
            System.out.println("读文件读错了！");
        }*/

       /* try {
            //创建输入流
            FileInputStream fis=new FileInputStream("C:\\Users\\86156\\Desktop\\JavaBilibili\\重点.txt");
            //读文件
            fis.read();
        } catch (IOException e) {//所有的异常都走这个分支。
            System.out.println("文件不存在！");
        } catch (FileNotFoundException e){//应该从小到大，'java.io.FileNotFoundException' has already been caught
            System.out.println("读文件读错了！");
        }*/

        //JDK8的新特性！
        try {
            //创建输入流
            FileInputStream fis=new FileInputStream("C:\\Users\\86156\\Desktop\\JavaBilibili\\重点.txt");
            //进行数学运算
            System.out.println(100/0);//这个异常是运行时异常，编写程序时可以处理，也可以不处理。
        } catch (FileNotFoundException | ArithmeticException | NullPointerException e) {
            System.out.println("文件不存在？数学异常？空指针异常？都有可能！");

        }

    }
}
