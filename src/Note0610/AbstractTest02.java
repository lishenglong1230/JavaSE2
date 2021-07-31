package Note0610;
/*
    抽象类：
        1、抽象类中不一定有抽象方法，抽象方法必须出现在抽象类中。
        2、重要结论：
            一个非抽象的类继承抽象类，必须将抽象类中的抽象方法实现了。
            这是java语法上强行规定的，必须的，不然编译器就报错了。

            这里的覆盖或者说重写，也可以叫做实现。（对抽象的实现。）

 */
public class AbstractTest02 {
    public static void main(String[] args) {
        //能不能使用多态？
        //父类型引用指向子类型对象。
        Animal a=new Bird();//向上转型。（自动类型转换）

        //这就是面向抽象编程。
        //以后你都是调用的a.xxxx
        //a的类型是Animal,Animal是抽象的
        //面向抽象编程，不要面向具体编程，降低程序的耦合度，提高程序的扩展力
        //这种编程思想符合OCP原则。
        a.move();//鸟儿在飞翔！
        Animal x=new Cat();
        x.move();//猫在走猫步！
    }
}
abstract class Animal{
    public abstract void move();
}
//错误：Bird不是抽象的，并且未覆盖Animal中的抽象方法move（）
/*
class Bird extends Animal{

}*/

class Bird extends Animal{
    //需要将从父类中继承过来的抽象方法进行覆盖/重写，或者也可以叫做"实现"。
    //把抽象的方法实现了。
    public void move(){
        System.out.println("鸟儿在飞翔！");
    }
}
class Cat extends Animal{
    public void move(){
        System.out.println("猫在走猫步！");
    }
}
//如果Bird是抽象类的话，那么这个Animal中继承过来的抽象方法也可以不去重写/覆盖/实现。
/*abstract class Bird extends Animal{

}*/
