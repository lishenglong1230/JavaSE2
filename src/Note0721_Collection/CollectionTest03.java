package Note0721_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
关于集合的迭代/遍历
 */
public class CollectionTest03 {
    public static void main(String[] args) {
        Collection c1=new ArrayList();
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add(4);
        c1.add(1);
        Iterator it=c1.iterator();
        while (it.hasNext()){
            //存进去是什么类型，取出来还是什么类型。
            //只不过在输出的时候会转换成字符串。println调用toString()方法。
            System.out.println(it.next());//1 2 3 4 1
        }

        //HashSet集合：无序不可重复
        Collection c2=new HashSet();
        //无序：存进去和取出的顺序不一定相同。
        //不可重复：存储100，不能再存储100。
        c2.add(100);
        c2.add(200);
        c2.add(300);
        c2.add(90);
        c2.add(400);
        c2.add(50);
        c2.add(60);
        c2.add(100);
        Iterator it2=c2.iterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }
    }
}
