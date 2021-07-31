package Note0612.first;

//顾客
public class Customer {
    //顾客手里有一个菜单
    //Customer has a FoodMenu!(这句话什么意思：顾客有一个菜单)
    //记住：以后凡是能够使用 has a 来描述的，统一以属性的方式存在。
    //面向抽象编程，面向接口编程。
    private FoodMenu foodMenu;//都要养成封装的好习惯。

    //如果以下这样写，就表示写死了（焊接了。没有可插拔了。）
    //中餐厨师
    //ChinaCooker cc;
    //西餐厨师
    //AmericaCooker ac;

    public Customer(){

    }
    public Customer(FoodMenu foodMenu){
        this.foodMenu=foodMenu;
    }
    public void setFoodMenu(){
        this.foodMenu=foodMenu;
    }
    public FoodMenu getFoodMenu(){
        return foodMenu;
    }
    //提供一个点菜的方法
    public void order(){
        //先拿到菜单才能点菜
        //调用get方法拿菜单
        //FoodMenu fm=this.getFoodMenu();
        //也可以不调用get方法，因为在本类中私有的属性是可以访问
        foodMenu.shiZiChaoJiDan();
        foodMenu.yuXiangRouSi();

    }
}
/*
    Cat is a Animal ,但凡满足 is a的表示都可以设置为继承。
    但凡满足has a 的表示都以属性的形式存在。
 */
/*"自己"类
MySelf has a friend;
class MySelf{
    //你这个对象，应该有一个朋友对象的的电话号码。
    //电话号码就是一个对象的内存地址。联系你朋友的时候，打电话。
    //f 是一个引用。f默认值是null，是null表示，你没有朋友。
    Friend f;
    public MySelf(){

    }
    public MySelf(Friend f){
        this.f=f;
    }

    public static void main(String[] args) {
        //创建朋友对象
        Friend f=new Friend();//朋友对象有了
        //创建对象的同时交朋友
        MySelf m2=new MySelf(f);

        //创建自己对象
        //目前还没有交朋友
        MySelf m=new MySelf();//自己对象
        //交朋友
        m.f=f;//把朋友的地址给了你。
    }
}
class Friend{

}*/
