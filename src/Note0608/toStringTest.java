package Note0608;
/*
   关于Object类中的toString()方法
        1、toString()方法的作用是什么？
            作用:将"java对象"转换成"字符串的形式" 。
        2、Object类中toString()方法的默认实现是什么？
            public String toString(){
                return getClass().getName()+"@"+Integer.toHexString(hashCode());
            }
            toString:方法名的意思是转换成String
            含义：调用一个java对象的toString()方法就可以将该对象转换成字符串的表示方式
        3、那么toString()方法给的默认实现够用吗？
        "相同的返回值类型"可以修改一下吗？
            对于返回值类型是基本数据类型来说，必须一致。
            对于返回值类型是引用数据类型来说，重写之后返回值类型可以变的更小。
 */
public class toStringTest {
    public static void main(String[] args) {
        MyDate t1=new MyDate();
        //重写toString()之前的方法
        //System.out.println(t1.toString());//Note0608.MyDate@1b6d3586
        //重写toString()之后的方法
        System.out.println(t1.toString());//1970年1年1日
        //当输出一个引用的时候，println方法会自动调用引用的toString方法。
        System.out.println(t1);//1970年1年1日
        MyDate t2=new MyDate(2008,8,8);
        System.out.println(t2);//2008年8年8日
        Student s=new Student(1111,"zhangsan");
        //System.out.println(s);//Note0608.Student@1b6d3586
        System.out.println(s);

    }
}
//日期类
class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate(){
        this(1970,1,1);
    }
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    //调用toString()方法进行字符串转换的时候
    //希望转换的结果是：xxxx年xx月xx日，这种格式。
    //重写一定要复制粘贴，不要手动编写，会错的。
    public String toString(){
        return year+"年"+month+"年"+day+"日";
    }
}
class Student{
    int no;
    String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }
    public String toString(){
        return "学号："+no+" 姓名："+name;
    }
}
