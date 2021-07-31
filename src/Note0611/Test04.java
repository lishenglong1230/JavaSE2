package Note0611;
/*
    继承和实现都存在的话，代码应该怎么写？
        extends 关键字在前。
        implements 关键字在后。
 */
public class Test04 {
    public static void main(String[] args) {
        //创建对象（表面看Animal类没起作用！）
        Flyable f=new Cat();
        f.fly();

        Flyable f2=new Pig();
        f2.fly();

        Flyable f3=new Fish();
        f3.fly();
    }
}
//动物类：父类
class Animal{

}
//可飞翔的接口（是一对翅膀 ）
//能插拔的就是接口。（没有接口你怎么插拔）。
//内存条插到主板上，他们之间有接口。内存条可以更换。
//接口通常提取的是行为动作。
interface Flyable{
    void fly();
}
//Flyable是一个接口，是一对翅膀的接口，通过接口插到猫身上，让猫变的可以飞翔。
class Cat extends Animal implements Flyable{
    public void fly(){
        System.out.println("飞猫起飞，翱翔太空的一只猫，很神奇，我想做一只猫！！");
    }
}
//蛇类，如果你不想让他飞，可以不实现Flyable接口
//没有实现这个接口表示你没有翅膀，没有给你插翅膀，你肯定不能飞。
class Snake extends Animal{

}
//想飞就插翅膀这个接口。
class Pig extends Animal implements Flyable{
    public void fly(){
        System.out.println("我是一只会飞的猪！！！");
    }
}
//鱼（默认实际上是存在继承的，默认继承Object。）
class Fish implements Flyable{//没写extends，也是有的，默认继承Object。
    public void fly(){
        System.out.println("我是六眼飞鱼（流言蜚语）！！！");
    }
}