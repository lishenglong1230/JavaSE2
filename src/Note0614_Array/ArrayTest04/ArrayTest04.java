package Note0614_Array.ArrayTest04;
//当一个方法的参数是一个数组的时候，我们还可以采用这种方式传。
public class ArrayTest04 {
    public static void main(String[] args) {
        int[] a={1,2,3};
        printArray(a);//123
        //没有这种语法
        //printArray({1,2,3});
        //如果直接传递一个静态数组的话，语法必须这样写。
        printArray(new int[]{1,2,3});
        int[] a2=new int[4];
        printArray(a2);//4个0

        printArray(new int[3]);//3个0
    }
    public static void printArray(int[] array){
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}
