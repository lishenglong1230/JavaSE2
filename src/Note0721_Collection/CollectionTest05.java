package Note0721_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/*
测试contains方法
测试remove方法
结论：存放在一个集合中的类型，一定要重写equals方法
 */
public class CollectionTest05 {
    public static void main(String[] args) {
        //创建集合对象
        Collection c= new ArrayList();
        //创建用户对象
        User u1=new User("jack");
        //加入集合
        c.add(u1);
        //判断集合中是否包含u2
        User u2=new User("jack");
        //没有重写equals之前
        //System.out.println(c.contains(u2));//false
        //重写equals方法之后，比较的时候会比较name。
        System.out.println(c.contains(u2));//true

        Integer x=new Integer(10000);
        c.add(x);
        Integer y = new Integer(10000);
        System.out.println(c.contains(y));//true

        //Integer的equals重写了
        //x.equals(y) --> true

        //创建集合对象
        Collection cc=new ArrayList();
        String s1=new String("hello");
        cc.add(s1);
        String s2=new String("hello");
        cc.remove(s2);//s1.equals(s2) java认为s1和s2是一样的。删除s2就是删除s1。
        System.out.println(cc.size());//0

    }
}
class User{
    private String name;
    public User(){
    }
    public User(String name){
        this.name=name;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }
}
