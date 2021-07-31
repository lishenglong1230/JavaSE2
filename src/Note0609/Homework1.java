package Note0609;
/*
    猜数字游戏
    一个类A有一个实例变量v，从键盘接受一个正整数作为实例变量v的初始值。
    另外再定义一个类B，对A类的实例变量v进行猜测。
       如果大了则提示大了
       小了则提示小了
       等于则提示猜测成功
 */
import java.util.Scanner;
public class Homework1 {
    public static void main(String[] args) {
        A a=new A(100);
        B b=new B(a);
        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.print("请输入要猜测的数字:");
            b.cai((s.nextInt()));
        }
    }
}
class A{
    private int v;

    public A(){
    }
    public A(int v){
        this.v=v;
    }

    public void setV(int v){
        this.v=v;
    }
    public int getV(){
        return v;
    }
}
class B{
    private A a;
    public B(){

    }
    public B(A a){
        this.a=a;
    }

    public void setA(A a){
        this.a=a;
    }
    public A getA(){
        return a;
    }

    //猜测的方法
    public void cai(int caiCeNum){
        //实际数字
        //int shiJiZhi=this.getA().getV();
        int shiJiZhi=a.getV();
        if(caiCeNum==shiJiZhi){
            System.out.println("猜对了");
            //终止程序的执行
            //退出JVM
            System.exit(0);//退出JVM
        }else if(caiCeNum>=shiJiZhi){
            System.out.println("猜大了");
        }else{
            System.out.println("猜小了");
        }
    }
}
