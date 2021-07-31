package Note0609;
/*
    请定义一个交通工具(Vehicle)的类
    其中有属性速度、体积、方法移动move、设置速度、加速speedUp()、减速speedDown()等等.
    最后在测试类Vehicle中的main（）中实例化一个交通工具对象
    并通过方法给它初始化speed，size的值并且打印出来。
    另外调用加速减速的方法对速度进行改变。
 */
public class Homework2 {
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        v.setSpeed(120);
        v.setSize(5);
        System.out.println("speed:"+v.getSpeed());
        System.out.println("size:"+v.getSize());
        //Vehicle v1=new Vehicle(120,5);
        //加速
        v.speedUp(20);
        System.out.println("speed:"+v.getSpeed());
        //减速
        v.speedDown(10);
        System.out.println("speed:"+v.getSpeed());
    }
}
class Vehicle{
    private int speed;
    private int size;

    public Vehicle(int speed, int size) {
        this.speed = speed;
        this.size = size;
    }

    public Vehicle() {
    }
    //设置速度的方法
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    //交通工具的移动方法
    public void move(){
        System.out.println("交通工具：公共汽车，起步行驶。");


    }
    //加速
    public void speedUp(int addSpeed){
        //this.setSpeed(this.getSpeed()+addSpeed);
        this.speed+=addSpeed;
    }
    //减速
    public void speedDown(int subSpeed){
        this.setSpeed(this.getSpeed()-subSpeed);
        //this.speed-=subSpeed;
    }
}
