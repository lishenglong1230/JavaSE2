package Note0614_Array.ArrayTest10;
/*
    关于二维数组中元素的：读和改
        a[二维数组中的下标][一维数组的下标]
        a[0][0]:表示第一个一维数组中的第1个元素。
        a[3][100]：表示第4个一维数组中的第101个元素。

        注意：对于a[3][100]来说，其中a[3]是一个整体。[100]是前面a[3]执行结束的结果然后再下标100
 */
public class ArrayTest10 {
    public static void main(String[] args) {
        int[][] a={
                {34,4,65},
                {100,200,3900,111},
                {0}
        };
        //请取出以上二维数组中的第一个一维数组，
        int[] a0=a[0];
        System.out.println(a0);//[I@1b6d3586
        //int b0=a0[0];另一种写法
        int b0=a[0][0];
        System.out.println(b0);//34

        //合并以上代码
        System.out.println(a[0][0]);//34
        //取出第2个一维数组当中第3个元素
        System.out.println("第二个一维数组中第三个元素"+a[1][2]);//3900
        //取出第3个一维数组当中第1个元素
        System.out.println("第3个一维数组中第1个元素"+a[2][0]);//0

        //改
        a[2][0]=11111;
        System.out.println(a[2][0]);//11111
        //注意别越界
        System.out.println(a[2][1]);//ArrayIndexOutOfBoundsException
    }
}
