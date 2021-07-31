package Note0614_Array.ArrayTest07;
/*
    一维数组的深入，数组中存储类型为：引用是“内存地址”。数组中存储的每个元素是“引用”。
 */
public class ArrayTest07 {
    public static void main(String[] args) {
        //a是一个数组
        //a[0]是数组中的一个元素。
        //a[1]是数组中的一个元素。
        Animal a1=new Animal();
        Animal a2=new Animal();
        Animal[] animals={a1,a2};

        //对Animal数组进行遍历
        for (int i = 0; i < animals.length; i++) {
            /*Animal a=animals[i];
            a.move();*/
            //代码合并
            animals[i].move();//这个move()方法不是数组的。是数组当中Animal对象的move()方法。
        }

        Animal[] ans=new Animal[2];
        ans[0]=new Animal();
        //Animal数组中只能存放Animal类型，不能存放Product类型。
        //ans[1]=new Product();
        //Animal数组中可以存放Cat类型的数据，因为Cat是一个Animal。
        ans[1]=new Cat();

        //创建一个Animal类型的数组，数组当中存储Cat和Bird
        Animal[] anis={new Cat(),new Bird()};
        for (int i = 0; i < anis.length; i++) {
            //Animal an=anis[i];
            //an.move();猫在走猫步！Bird Fly!!!

            //anis[i].sing();如果不向下转型，Animal中没有sing()方法。
            if(anis[i] instanceof Cat){
                Cat cat=(Cat)anis[i];
                cat.catchMouse();//猫抓老鼠！
            }else if(anis[i] instanceof Bird){
                Bird bird=(Bird)anis[i];
                bird.sing();//鸟儿在唱歌！！！
            }
        }
    }
}
class Animal{
    public void move(){
        System.out.println("Animal move..");
    }
}
class Product{

}
class Cat extends Animal{
    public void move(){
        System.out.println("猫在走猫步！");
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠！");
    }
}
class Bird extends Animal{
    public void move(){
        System.out.println("Bird Fly!!!");
    }
    public void sing(){
        System.out.println("鸟儿在唱歌！！！");
    }
}