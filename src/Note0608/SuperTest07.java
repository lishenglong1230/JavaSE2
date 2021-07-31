package Note0608;
/*
    在父和子中有同名的属性，或者说有相同的方法。
    如果此时想在子类中访问父中的数据，必须使用"super."加以区分。

    super.属性名   【访问父类的属性】
    super.方法名(实参) 【访问父亲的方法】
    super(实参)   【调用父亲的构造方法】
 */
public class SuperTest07 {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.yiDong();//Cat move!
                   //Cat move!
                   //Animal move!

    }
}
class Animal{
    public void move(){
        System.out.println("Animal move!");
    }
}
class Cat extends Animal{
    public void move(){
        System.out.println("Cat move!");
    }
    //单独编写一个子类特有的方法。
    public void yiDong(){
        this.move();
        move();
        //super.不仅可以访问属性，也可以访问方法。
        super.move();
    }
}
