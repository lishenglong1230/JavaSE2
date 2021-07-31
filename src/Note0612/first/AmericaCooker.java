package Note0612.first;
//美国厨师
//实现菜单上的菜
//厨师是接口的实现者
public class AmericaCooker implements FoodMenu{
    public void shiZiChaoJiDan(){
        System.out.println("西餐师傅做的西红柿炒鸡蛋！");
    }
    public void yuXiangRouSi(){
        System.out.println("西餐师傅做的鱼香肉丝！");
    }
}
