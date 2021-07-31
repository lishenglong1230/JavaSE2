package Note0613.Test02;
/*
    关于Object类中的equals方法
        1、equals方法的源代码
            public boolean equals(Object obj){
                return(this==obj)
            }
        2、SUN公司设计equals方法的目的是什么？
            以后编程的过程当中，都要通过equals方法来判断两个对象是否相等。
            equals方法是判断两个对象是否相等的。
        3、我们需要研究一下Object类给的这个默认的equals方法够不够用
        4、判断两个java对象是否相等，不能使用"=="，以为"=="比较的是两个对象的内存地址。

 */
public class Test02 {
    public static void main(String[] args) {
        //判断两个基本数据类型的数据是否相等直接使用"=="就行。
        int a=100;
        int b=100;
        //这个"=="是判断a中保存的100和b中保存的100是否相等。
        System.out.println(a==b);//true

        //判断两个java对象是否相等，我们怎么办？能直接使用"=="吗？
        MyTime t1=new MyTime(2008,8,8);//MyTime t1=0x1234;
        MyTime t2=new MyTime(2008,8,8);//MyTime t2=0x3698;

        //测试以下，比较两个对象是否相等，能不能使用"=="???
        //这里的"=="判断的是：t1中保存的对象内存地址和t2中保存的对象内存地址是否相等。
        System.out.println(t1==t2);//false

        //重写equals方法之前
        boolean flag=t1.equals(t2);
        System.out.println(flag);//false

        //重写equals方法之后
        boolean flag2=t1.equals(t2);
        System.out.println(flag2);//true

        MyTime t3=new MyTime(2008,8,9);
        System.out.println(t1.equals(t3));//false

        //我们这个程序有bug吗？可以运行，但是效率低。
        MyTime t4=null;
        System.out.println(t1.equals(t4));//false

    }
}
class MyTime {
    int year;
    int month;
    int day;

    public MyTime() {
    }

    public MyTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //重写Object类的equals方法
    //怎么重写？复制粘贴。相同的返回值类型、相同的方法名、相同的形式参数列表。
/*    public boolean equals(Object obj){
        //获取第一个日期的年月日
        int year1=this.year;
        int month1=this.month;
        int day1=this.day;
        //获取第二个日期的年月日
        if(obj instanceof MyTime){
            MyTime mt=(MyTime)obj;
            int year2=mt.year;
            int month2=mt.month;
            int day2=mt.day;
            if(year1==year2 && month1==month2 && day1==day2){
                return true;
            }
        }
        return false;
    }*/
    //改良equals方法
    /*public boolean equals(Object obj){
        //如果obj是空，直接返回false
        if(obj==null){
            return false;
        }
        //如果obj不是一个MyTime，没必要比较了，直接返回false
        if(!(obj instanceof MyTime)){
            return false;
        }
        //如果this和obj保存的内存地址相同，直接返回true
        if(this == obj){
            return true;
        }
        //程序能够执行到此处说明什么？
        //说明obj不是null，obj是MyTime类型。
        MyTime t=(MyTime)obj;
        if(this.year==t.year && this.month==t.month && this.day==t.day){
            return true;
        }
        return false;

    }*/
    //再次改良
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MyTime)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        MyTime t = (MyTime) obj;
        return this.year == t.year && this.month == t.month && this.day == t.day;
    }
//IDEA自动生成

/*    @Override
    public String toString() {
        return "MyTime{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }*/

}
