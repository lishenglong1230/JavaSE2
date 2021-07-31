package Note0614_Array.ArrayTest03;
//当一个方法上，参数的类型是一个数组的时候
public class ArrayTest03 {
    //main方法的编写方式，还可以采用C++的语法格式哦！
    public static void main(String[] args) {
        System.out.println("hello world!");
        int[] x={1,2,3,4};
        printArray(x);
        String[] stringArray={"abc","def","hehe","haha"};
        printArray(stringArray);
        String[] strArray=new String[10];
        printArray(strArray);//10个null
        printArray(new String[3]);//3个null
        printArray(new int[4]);//4个0
    }
    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++) {
            System.out.println(array[i]);
        }
    }
    public static void printArray(String[] args){
        for (int i = 0; i < args.length; i++) {
            System.out.println("String数组中的元素："+args[i]);
        }
    }
}
