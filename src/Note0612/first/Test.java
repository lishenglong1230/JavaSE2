package Note0612.first;

public class Test {
    public static void main(String[] args) {
        //创建厨师对象
        //FoodMenu cooker1=new ChinaCooker();中餐师傅做的西红柿炒鸡蛋，东北口味！
                                            // 中餐师傅做的鱼香肉丝，东北口味！
        FoodMenu cooker2=new AmericaCooker();//西餐师傅做的西红柿炒鸡蛋！
                                             //西餐师傅做的鱼香肉丝！
        //创建顾客对象
        Customer customer=new Customer(cooker2);
        //顾客点菜
        customer.order();
    }
}
