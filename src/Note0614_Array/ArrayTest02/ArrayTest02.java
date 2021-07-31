package Note0614_Array.ArrayTest02;
/*
    什么时候采用静态初始化方式，什么时候使用动态初始化方式呢？
        当你创建数组的时候，确定数组中存储哪些具体的元素时，采用静态初始化方式。
        当你创建数组的时候，不确定将来数组中存储哪些数据，你可以采用动态初始化的方式，预先分配内存空间。
 */
public class ArrayTest02 {
    public static void main(String[] args) {
        //声明/定义一个数组，采用动态初始化的方式创建
        int[] a=new int[4];//创建长度为4的int数组，数组中每个元素的默认值是0
        //遍历数组
        for(int i=0;i<a.length;i++){
            System.out.println("数组中下标为"+i+"的元素是:"+a[i]);
        }
        //后期赋值
        a[0]=1;
        a[1]=100;
        a[2]=111;
        a[3]=222;

        //初始化一个Object类型的数组,采用动态初始化方式
        Object[] objs=new Object[3];//3个长度，动态初始化，所以每个元素默认值是null
        for(int i=0;i<objs.length;i++){
            System.out.println(objs[i]);
        }

        String[] strs=new String[3];
        for(int i=0;i < strs.length;i++){
            System.out.println(strs[i]);
        }
        //存储Object，采用静态初始化呢？
        Object o1=new Object();
        Object o2=new Object();
        Object o3=new Object();
        //Object[] objects={new Object(),new Object(),new Object()};
        Object[] objects={o1,o2,o3};
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);//地址
        }
    }
}
