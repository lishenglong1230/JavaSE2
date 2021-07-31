package Note0723_List;

import java.lang.reflect.Array;
import java.util.*;

/*
测试List接口中常用方法
    1、List集合存储元素特点：有序可重复
        有序：List集合中的元素有下表。
        从0开始，以1递增。
        可重复：存储一个1，还可以在存储1
    2、List既然是Collection接口的子接口，那么肯定List接口有自己“特色”的方法：
        以下只列出List接口特有的常用的方法：
        void add(int index,E element)
        E get(int index)
        int indexOf(Object o)
        int lastIndexOf(Object o)
        E remove(int index)
        E set(int index,E element)
 */
public class ListTest01 {
    public static void main(String[] args) {
        //List list=new LinkedList();
        //List myList=new Vector();
        List myList=new ArrayList();

        myList.add("A");//默认向集合末尾添加元素。
        myList.add("B");
        myList.add("C");
        myList.add("C");
        myList.add("D");

        //在列表的指定位置插入指定元素（第一个参数是下标）
        //这个方法使用不多，因为对于ArrayList集合来说效率比较低。
        myList.add(1,"KING");

        Iterator it=myList.iterator();
        while (it.hasNext()) {
            Object elt=it.next();
            System.out.println(elt);
        }

        //根据下标获取元素
        System.out.println(myList.get(0));

        //因为有下标，所以List集合有自己比较特殊的遍历方式
        //通过下标遍历。【List集合特有的方式，Set没有。】
        for (int i = 0; i < myList.size(); i++) {
            Object obj=myList.get(i);
            System.out.println(obj);
        }

        //获取指定对象第一次出现处的索引。
        System.out.println(myList.indexOf("KING"));//1
        //获取指定对象最后一次出现处的索引。
        System.out.println(myList.lastIndexOf("C"));//4

        //删除指定下标位置的元素
        myList.remove(0);
        System.out.println(myList.size());//5
        System.out.println("==============================");

        //修改指定位置的元素
        myList.set(2,"Soft");
        for (int i = 0; i < myList.size(); i++) {
            Object obj=myList.get(i);
            System.out.println(obj);
        }
    }
}
/*
计算机英语：
    增删改查这几个单词要知道：
        增：add、save、new
        删：delete、drop、remove
        改：update、set、modify
        查：find、get、query、select
 */