package Note0717_Date;

import java.util.Random;

/*
编写程序，生成5个不重复的随机数[0~100]。重复的话重新生成。
最终生成的5个随机数放到数组中，要求数组中这个5个随机数不重复。
 */
public class RandomTest02 {
    public static void main(String[] args) {
        //创建Random对象
        Random random = new Random();
        //准备一个长度为5的一维数组
        int[] arr=new int[5];//默认值都是0
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        //循环，生成随机数
        int index = 0;
        while (index < arr.length){
            int num=random.nextInt(6);//0~5
            //int num=random.nextInt(4)  0~3死循环
            //判断arr数组中有没有num
            //如果没有这个num，就放进去
            if (!contains(arr,num)){
                arr[index++]=num;
            }
        }
        //遍历以上的数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    /**
     * 单独编写一个方法，这个方法专门用来判断数组中是否包含某个元素
     * @param arr 数组
     * @param key 元素
     * @return true表示包含，false表示不包含。
     */
    public static boolean contains(int[] arr,int key){
        //这个方法有bug
       /* //对数组进行排序
        Arrays.sort(arr);
        //进行二分法查找 >= 0说明。这个元素找到了，找到了表示存在！
        return Arrays.binarySearch(arr,key)>=0;*/
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                //条件成立了表示包含，返回true
                return true;
            }
        }
        return false;

    }

}
