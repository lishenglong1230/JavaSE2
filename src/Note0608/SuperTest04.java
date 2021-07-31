package Note0608;
/*
    "this."和"super."大部分情况下都是可以省略的。
    super.什么时候不能省略？
    父中有，子中又有，如果想在子中访问"父的特征"，super.不能省略。
 */
public class SuperTest04 {
    public static void main(String[] args) {
        Vip v=new Vip("张三");
        v.shopping();
    }
}
class Customer{
    String name;

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
    }
    public void doSome(){
        System.out.println(this.name+"do Some!");
        System.out.println(name+"do some!");
        //错误：找不到符号
        //System.out.println(super.name+"do some!");
    }
}
class Vip extends Customer{
    //假设子类也有一个同名属性
    //java中允许在子类中出现和父亲一样的同名变量/同名属性
    String name;

    public Vip() {
    }
    public Vip(String name) {//只给父类中的属性赋值
        super(name);
        //this.name=null;
    }
    public void shopping(){
        /*
            java是怎么来区分子类和父类的同名属性的？
                this.name:当前对象的name属性
                super.name:当前对象的父类型特征中的name属性。
         */
        //this表示当前对象。
        System.out.println(this.name+"正在购物");//null正在购物
        //super表示的是当前对象的父类型特征。（super是this指向的那个对象中的一块空间。）
        System.out.println(super.name+"正在购物");//张三正在购物
        System.out.println(name+"正在购物");//null正在购物 默认this.name
    }
}