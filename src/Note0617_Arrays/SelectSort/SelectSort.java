package Note0617_Arrays.SelectSort;
/*
选择排序：
    每一次从这堆"参与比较的数据当中"找出最小值，
    拿着这个最小值和"参与比较的这堆最前面的元素"交换位置。

    选择排序比冒泡排序好在：每一次的交换位置都是有意义的。

    关键点：选择排序中的关键在于，你怎么找出一位数据中最小的。
        3 1 6 2 5
        假设：第一个3是小的。
        3和1比较，发现2更小，所以此时最小的是2
        继续拿着2往下比对，2和6比较，2仍然是最小的
        继续拿着2往下比对，2和1比对，发现1更小，所以此时最小的是1》

        拿着1和最左边的3交换位置。

    2 6 3 5
    假设：
     第一个2是最小的。
     ...

    6 3 5
    假设6是最小的：
    6和3比对，发现更小，所以此时最小的是3.
    ...
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr={9,8,10,7,6,0,11};
        int count = 0;
        int count2 = 0;
        //选择排序
        //7条数据循环6次。（外层循环6次）
        for (int i = 0; i < arr.length - 1; i++) {
            // i的值是0 1 2 3 4 5 6
            // i正好是"参加比较的这堆数据中"最左边那个元素的下标。
            // i是一个参与比较的这堆数据中定的起点下标。
            // 假设起点i下标位置上的元素是最小的。
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                count++;
                if (arr[j]<arr[min]){
                    min = j;//最小值得元素下标是j
                }
            }
            //当i和min相等时，表示最初猜测是对的。
            //当i和min不相等时，表示最初猜测是错的，有比这个元素更小的元素，
            //需要拿着这个更小的元素和最左边的元素交换位置。
            if (min != i){
                //表示存在更小的数据
                //arr[min] 最小的数据
                //arr[i] 最前面的数据
                int temp;
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
                count2++;
            }
        }
        //冒泡排序和选择排序实际上比较的次数没变。
        //交换位置的次数减少了。

        System.out.println("比较次数" + count);//21
        System.out.println("交换位置的次数"+count2);//5
        //排序之后遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
