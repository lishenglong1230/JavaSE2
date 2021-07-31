package Note0724;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
1、JDK5.0之后推出的新特性：泛型
2、泛型这种语法机制，只在程序编译阶段起作用，只是给编译器参考的。（运行阶段泛型没用）
3、使用泛型的好处是什么？
    第一：集合中存储的元素类型统一了。
    第二：从集合中取出的元素类型是泛型指定的类型，不需要进行大量的"向下转型"！
4、泛型的缺点是什么？
    导致集合中存储的元素缺乏多样性！
    大多数业务中，集合中元素的类型还是统一的。所以这种泛型特性被大家所认可。
 */
public class GenericTest01 {
    public static void main(String[] args) {
        //不适用泛型机制，分析程序存在缺点
        /*List myList=new ArrayList();
        Cat c=new Cat();
        Bird b=new Bird();
        myList.add(c);
        myList.add(b);
        //遍历集合，取出Cat让它抓老鼠，取出Bird让它飞！
        Iterator it=myList.iterator();
        while (it.hasNext()){
            Object obj=it.next();
            //obj中没有move方法，无法通用，需要向下转型！
            if (obj instanceof Animal){
                Animal a=(Animal)obj;
                a.move();
            }
        }
        */
        //使用JDK5之后的泛型机制
        //使用泛型List<Animal>之后，表示List集合中只允许存储Animal类型的数据。
        //用泛型来指定集合中存储的数据类型。
        List<Animal> mylist=new ArrayList<Animal>();

        //指定List集合中只能存储Animal，那么存储String就编译报错了。
        //这样用了泛型之后，集合中元素的数据类型更加统一了。
        //mylist.add("abc");

        Cat c=new Cat();
        Bird b=new Bird();

        mylist.add(c);
        mylist.add(b);

        //获取迭代器
        //这个表示迭代器迭代的是Animal类型。
        Iterator<Animal> it=mylist.iterator();
        while (it.hasNext()){
            //使用泛型之后，每一次迭代返回的数据都是Animal数据。
            Animal a=it.next();
            //这里不需要进行强制类型转换了。直接调用。
            a.move();
            //调用子类型特有的方法还是需要向下转换的！
            if (a instanceof Cat){
                Cat x=(Cat)a;
                x.catchMouse();
            }
            if (a instanceof Bird){
                Bird y=(Bird)a;
                y.fly();
            }
        }

    }
}
class Animal{
    public void move(){
        System.out.println("动物在移动！");
    }
}
class Cat extends Animal{
    public void catchMouse(){
        System.out.println("猫抓老鼠！");
    }
}
class Bird extends Animal{
    public void fly(){
        System.out.println("鸟儿在飞翔！");
    }
}