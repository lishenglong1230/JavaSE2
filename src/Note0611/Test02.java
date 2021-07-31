package Note0611;
/*
    接口的基础语法：
        1、类和类之间叫做继承，类和接口之间叫做实现。
        别多想：你仍然可以将"实现"看做"继承"。
        继承使用extends关键字完成。
        实现使用implements关键字完成。
        2、当一个非抽象的类实现接口的话，必须将接口中所有的抽象方法全部实现。
 */
public class Test02 {
    public static void main(String[] args) {
        //错误：MyMath是抽象类，无法实例化
        //new MyMath();
        //能使用多态吗？可以。
        MyMath mm=new MyMathImpl();
        //调用接口里面的方法（面向接口编程。）
        int result1=mm.sum(10,20);
        System.out.println(result1);
        int result2=mm.sub(20,10);
        System.out.println(result2);

    }
}
//特殊的抽象类，完全抽象的，叫做接口。
interface MyMath{
    double PI=3.1415926;
    int sum(int a,int b);
    int sub(int a,int b);
}
//这样没问题
/*
abstract class MyMathImpl implements MyMath {
}*/
//编写一个类（这个类是一个"非抽象"的类）
//错误：MyMathImpl不是抽象的，并且未覆盖MyMath中的抽象方法sub（int,int）
/*class MyMathImpl implements MyMath{
}*/
//修正
class MyMathImpl implements MyMath {
    //重写/覆盖/实现接口中的方法
    //错误：
/*    int sum(int a, int b) {
        return a + b;
    }*/
    public int sum(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }
}