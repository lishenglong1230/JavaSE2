package Note0608;
/*
    1、在恰当的时间使用：super（实际参数列表）
    2、注意：在构造方法执行的过程中一连串调用了父类的构造方法，
    父类定的构造方法又继续向下调用它的父亲的构造方法，但是实际上对象只创建了一个
    3、思考："super（实参）"到底是干啥的？
        super（实参）的作用是：初始化当前对象的父类型特征。
        并不是创建新对象。实际上对象只创建了1个。
    4、super关键字代表什么？
        代表的就是"当前对象"的那部分父类型特征。
 */
public class SuperTest03 {
    public static void main(String[] args) {
        CreditAccount ca1=new CreditAccount();
        System.out.println(ca1.getActno()+","+ca1.getBalance()+","+ca1.getCredit());//null,0.0,0.0
        CreditAccount ca2=new CreditAccount("1111",10000.0,0.999);
        System.out.println(ca2.getActno()+","+ca2.getBalance()+","+ca2.getCredit());//1111,10000.0,0.999
    }
}
class Account{
    private String actno;
    private double balance;

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public Account() {
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
class CreditAccount extends Account{
    public CreditAccount(String actno, double balance, double credit) {
        //this.actno=actno;私有的
        //this.balance=balance;私有的
        //super();默认赋值 null，0.0
        super(actno, balance);
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    private double credit;
    public CreditAccount(){

    }
}

