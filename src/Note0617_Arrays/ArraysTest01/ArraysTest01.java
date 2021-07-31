package Note0617_Arrays.ArraysTest01;

import java.util.Arrays;

public class ArraysTest01 {
    public static void main(String[] args) {
        int[] arr={112,3,4,56,67,1};
        Arrays.sort(arr);//从小到大排序
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
