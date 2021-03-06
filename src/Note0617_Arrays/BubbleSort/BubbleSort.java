package Note0617_Arrays.BubbleSort;
/*
    冒泡排序算法：
        1、每一次循环结束之后，都要找出最大的数据，放到参与比较的这堆数据的最右边。（冒出最大定的那个气泡。）
        2、核心：
            拿着左边的数字和右边的数字比对，当左边>右边的时候，交换位置。
    原始数据：
    3,2,7,6,8
    第一次循环：（最大的跑到最右边。）
    2,3,7,6,8
    2,3,7,6,8（虽然不需要交换位置：但是3和7还是需要比较一次。）
    2,3,6,7,8
    2,3,6,7,8（虽然不需要交换位置：但是3和7还是需要比较一次。）

    经过第1次循环，此时剩下参与比较的数据：2,3,6,7
    第2次循环：
    2,3,6,7（2和3比较，不需要交换位置）
    2,3,6,7（3和6比较，不需要交换位置）
    2,3,6,7（6个7比较，不需要交换位置）

    经过第2次循环，此时剩下参与比较的数据：2,3,6
    第3次循环：
    2,3,6（2和3比较，不需要交换位置）
    2,3,6（3和6比较，不需要交换位置）

    经过第3次循环，此时剩下参与比较的数据：2,3
    第4次循环：
    2,3（2和3比较，不需要交换位置）
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={9,8,10,7,6,0,11};
        int count = 0;
        int count2 = 0 ;
        for (int i = arr.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                //不管是否需要交换位置，总之是要比较一次的。
                count++;
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    count2++;
                }
            }
        }
        System.out.println("比较次数"+count);//21
        System.out.println("交换位置的次数"+count2);//13
        //输出结果
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
