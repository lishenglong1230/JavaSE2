package Note0611.Test01;
/*
    接口：
        1、接口也是一种"引用数据类型"。编译之后也是一个class字节码文件
        2、接口是完全抽象的。（抽象类是半抽象。）或者也可以说接口是特殊的抽象类。
        3、接口怎么定义，语法是什么？
            [修饰符列表] interface 接口名{
            }
        4、接口支持多继承，一个接口可以继承多个接口。
        5、接口中只包含两部分内容，一部分是：常量。一部分是：抽象方法。接口中没有其他内容了。
            只有以上两部分。
        6、接口中所有的元素都是public修饰的。（都是公开的。）
        7、接口中的抽象方法定义时：public abstract修饰符可以省略。
        8、接口中的方法都是抽象方法，所以接口中的方法不能有方法体。
        9、接口中的常量的public static final可以省略。
 */
public class Test01 {
    public static void main(String[] args) {
        System.out.println(Mymath.PI);//3.1415926
        //常量能重新复制吗？
        //错误：无法为最终变量PI分配值
        //Mymath.PI=3.1415928;
    }
}

/*//定义接口
interface A{

}
interface B{

}
//一个接口可以继承多个接口（支持多继承）
interface C extends A,B{

}*/
//我的数学接口
interface Mymath{
    //常量
    //public static final double PI=3.1415926;
    //public static final可以省略吗？
    double PI=3.1415926;
    public abstract int sum(int a,int b);
    //接口当中既然都是抽象方法，那么在编写代码的时候，public abstract可以省略吗？
    int sub(int a,int b);
    //接口中的方法可以有方法体吗？
    //错误：接口抽象方法不能带有主体
/*    void doSome(){

    }*/

}
