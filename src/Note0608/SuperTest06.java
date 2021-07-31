package Note0608;
/*
    super 不是引用。super也不保存内存地址，super也不指向任何对象。
    super 只是代表当前对象内部的那一块父类型的特征。
 */
public class SuperTest06 {
    public void doSome(){
        System.out.println(this);//Note0608.SuperTest06@1b6d3586
        //输出"引用"的时候，会自动调用引用的toString（）方法。
        //System.out.println(this.toString());
        //编译错误：需要"."
        //System.out.println(super);
    }
    public static void main(String[] args) {
        SuperTest06 st=new SuperTest06();
        st.doSome();//Note0608.SuperTest06@1b6d3586
    }
}
