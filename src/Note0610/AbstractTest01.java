package Note0610;
/*
    类到对象实例化。对象到类是抽象。
    1、什么是抽象类？
        类和类之间具有共同特征，将这些共同特征提取出来，形成的就是抽象类。
        类本身是不存在的，所以抽象类无法创建对象《无法实例化》。
    2、抽象类属于什么类型？
        抽象类也属于引用数据类型。

    3、抽象类怎么定义？
        语法：
            [修饰符列表] abstract class 类名{
                类体;
            }
    4、抽象类是无法实例化的，无法创建对象的，所以抽象类是用来被子类继承的。
    5、final和abstract不能联合使用，这两个关键字是对立的。
    6、抽象类的子类可以是抽象类
    7、抽象类虽然无法实例化，但是抽象类有构造方法，这个构造方法是供子类使用的。
    8、抽象类关联到一个概念：抽象方法。什么是抽象方法呢？
        抽象方法表示没有实现的方法，没有方法体的方法。例如：
        public abstract void doSome();
        抽象方法特点是：
            特点1：没有方法体，以分号结尾。
            特点2：前面修饰符列表中有abstract关键字。
    9、抽象类中不一定有抽象方法，抽象方法必须出现在抽象类中。
    面试题（判断题）：java语言中凡是没有方法体的方法都是抽象方法。
        不对，错误的。
        Object类中就有很多方法都没有方法体，都是以";"结尾的，但他们都不是抽象方法，例如：
            public native int hasCode()；
            这个方法底层调用了C++写的动态链接库程序。
            前面修饰符列表中没有：abstract。有一个native。表示调用JVM本地程序。

 */
public class AbstractTest01 {
    public static void main(String[] args) {
        //错误：Account是抽象的;无法实例化
        //new Account();
    }
}
//银行账户类
//final abstract class Account{}
abstract class Account{
    public Account(){

        }
    public Account (String s){

    }
    //非抽象方法
    public void doOther(){

    }
    //抽象方法
    //public abstract void withdraw();

}
//子类继承抽象类，子类可以实例化对象。
class CreditAccount extends Account{
   public CreditAccount(){
       super();
   }
}
//抽象类的子类可以是抽象类。
/*
abstract class CreditAccount extends Account{

}*/
