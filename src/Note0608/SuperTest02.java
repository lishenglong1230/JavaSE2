package Note0608;
//在java语言中不管是new什么对象，最后Object类的无参数构造方法一定会执行
public class SuperTest02 {
    public static void main(String[] args) {
        new C();//A的无参数构造执行
                //B类的有参数构造执行（String）
                //C的有参数构造执行(String,int)
                //C的有参数构造执行（String）
                //C的无参数构造执行
    }
}
class A{
    public A(){
        System.out.println("A的无参数构造执行");
    }
}
class B extends A{
    public B(){
        System.out.println("B的无参数构造执行");
    }
    public B(String name){
        System.out.println("B类的有参数构造执行（String）");
    }
}
class C extends B{
    public C(){
        this("zhangsan");
        System.out.println("C的无参数构造执行");
    }
    public C(String name){
        this(name,20);
        System.out.println("C的有参数构造执行（String）");
    }
    public C(String name,int age){
        super(name);
        System.out.println("C的有参数构造执行(String,int)");
    }
}
/*
A的无参数构造执行
B类的有参数构造执行（String）
C的有参数构造执行(String,int)
C的有参数构造执行（String）
C的无参数构造执行
 */