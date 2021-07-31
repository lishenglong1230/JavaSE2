package Note0613.Test08;
/*
    匿名内部类：
        1、什么是内部类？
            内部类：在类的内部又定义了一个新的类。
        2、内部类的分类：
            静态内部类：类似于静态变量
            实例内部类：类似于实例变量
            局部内部类：类似于局部变量
        3、使用内部类编写的代码，可读性很差，能不用尽量不用
        4、匿名内部类是局部内部类的一种。
           因为这个类没有名字而得名，叫做匿名内部类。
        5、学习匿名内部类主要是让大家以后在阅读别人代码的时候，能够理解。
        并不代表以后都要这样写。因为匿名内部类有两个缺点：
            缺点1：太复杂，太乱，可读性差。
            缺点2：类没有名字，以后想重复使用，不能用。
 */
public class Test08 {
    //静态变量
    static String country;
    //该类在类的内部，所以称为内部类
    //由于前面有static，所以称为"静态内部类"
    static class Inner1{
    }
    //实例变量
    int age;
    //没有static叫做实例内部类。
    class Inner2{
    }
    //方法
    public void doSome(){
        //局部变量
        int i100;
        //局部内部类
        class Inner3{
        }
    }
    public void doOther(){
        //doSome()方法中的局部内部类Inner3，在doOther()中不能用。
    }

    public static void main(String[] args) {
        //调用MyMath中的mySum方法。
        MyMath mm=new MyMath();
        //这样写代码，表示这个类名是有的。类名是：ComputeImpl
        //mm.mysum(new ComputeImpl(), 100, 200);//100+200=300

        //使用匿名内部类，表示这个ComputeImpl这个类没有名字了。
        //这里表面看上去好像是接口可以直接new了，实际上并不是接口可以new了。
        //后面的{}代表了对接口的实现。
        //不建议使用匿名内部类，为什么？
        //因为一个类没有名字，没有办法重复使用。另外代码太乱，可读性太差。
        //IDEA工具中纠正错误的快捷键：alt+回车
        mm.mysum(new Compute() {
            public int sum(int a, int b) {
                return a+b;
            }
        }, 200, 300);//200+300=500

    }
}
//负责计算的接口
interface Compute{
    //抽象方法
    int sum(int a,int b);
}
//你自动会在这里编写一个Compute接口的实现类
/*class ComputeImpl implements Compute{
    //对方法的实现
    public int sum(int a, int b) {
        return a+b;
    }
}*/
//数学类
class MyMath {
    //数学求和方法
    public void mysum(Compute c,int x,int y){
        int retValue=c.sum(x,y);
        System.out.println(x+"+"+y+"="+retValue);
    }
}
