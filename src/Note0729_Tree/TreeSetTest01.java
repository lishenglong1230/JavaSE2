package Note0729_Tree;

import java.util.Set;
import java.util.TreeSet;
/*
TreeSet集合存储元素特点：
    1、无序不可重复的，但是存储的元素可以自动按照大小顺序排序！
    称为可排序集合。
    2、无序：这里的无序指的是存进去的顺序和取出来的顺序不同。并没有下标
 */
public class TreeSetTest01 {
    public static void main(String[] args) {
        Set<String> strs=new TreeSet<>();
        strs.add("A");
        strs.add("B");
        strs.add("Z");
        strs.add("Y");
        strs.add("Z");
        strs.add("K");
        strs.add("M");

        //遍历
        /*
        A
        B
        K
        M
        Y
        Z
        从小到大自动排序！
         */
        for(String s:strs){
            System.out.println(s);
        }

    }
}
