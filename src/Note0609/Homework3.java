package Note0609;
/*
    定义名为Number的类其中有两个整形数据成员n1和n2应声明为私有。
    编写构造方法赋予n1和n2初始值
    再为该类定义addition、subtraction、multiplication、division等公有实例方法
    分别对两个成员变量执行加减乘除的运算。
 */
public class Homework3 {
    public static void main(String[] args) {
        Number number=new Number(10,0);
        number.addition();
        number.subtraction();
        number.multiplication();
        number.division();
    }
}
class Number{
    private int n1;
    private int n2;

    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public Number() {
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public void addition(){
        System.out.println(this.getN1()+"+"+this.getN2()+"="+(this.getN1()+this.getN2()));
    }
    public void subtraction(){
        int result=n1-n2;
        System.out.println(n1+"-"+n2+"="+(result));
    }
    public void multiplication(){
        System.out.println(this.getN1()+"*"+this.getN2()+"="+(this.getN1()*this.getN2()));
    }
    public void division(){
        if(n2==0){
            System.out.println("除数不能为0");
            return;//或者else if
        }
        System.out.println(this.getN1()+"/"+this.getN2()+"="+(this.getN1()/this.getN2()));
    }
}
