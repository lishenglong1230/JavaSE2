package Note0609;
/*
    编写java程序用于显示人的姓名和年龄。
    定义一个人类Person该类中应该有两个私有属性姓名name和年龄age。
    定义构造方法用来初始化数据成员。再定义显示display方法将姓名和年龄打印出爱。
    在main方法中创建人类的实例然后将信息显示。
 */
public class Homework4 {
    public static void main(String[] args) {
        Person p1=new Person("张三",20);
        p1.display();
        Person p2=new Person("李四",30);
        p2.display();
    }
}
class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void display(){
        //System.out.println("姓名："+this.getName()+" 年龄："+this.getAge());
        //System.out.println("姓名："+this.name+" 年龄："+this.age);
        System.out.println("姓名："+name+" 年龄："+age);
    }
}
