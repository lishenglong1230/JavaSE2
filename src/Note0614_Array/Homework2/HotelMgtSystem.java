package Note0614_Array.Homework2;

import java.util.Scanner;

/*
第二题：
    为某个酒店编写程序酒店管理系统，模拟订房、退房、打印所有房间状态等功能。
    1、该系统的用户是：酒店前台。
    2、酒店使用一个二维数组来模拟。
    3、酒店中的每一个房间应该是一个java对象：Room
    4、每一个房间Room应该有：房间编号、房间类型、房间是否空闲.
    5、系统应该对外提供的功能：
        可以预订房间：用户名输入房间编号，订房。
        可以退房：用户输入房间编号，退房。
        可以查看所有房间的状态：用户输入某个指令应该可以查看所有房间状态。
 */
public class HotelMgtSystem {
    public static void main(String[] args) {
        //创建酒店对象
        Hotel hotel=new Hotel();
        //打印房间状态
        //hotel.print();

        /*
        首先输出一个欢迎页面
         */
        System.out.println("欢迎使用酒店管理系统，请认真阅读以下使用说明");
        System.out.println("请输入对应的功能编号：[1]表示查看房间列表。[2]表示订房。[3]表示退房。[0]表示退出");
        Scanner s=new Scanner(System.in);
        while(true) {
            System.out.print("请输入功能编号：");
            int i = s.nextInt();
            if (i == 1) {
                //表示查看房间列表
                hotel.print();
            } else if (i == 2) {
                //订房
                System.out.print("请输入订房编号：");
                int roomNo = s.nextInt();
                hotel.order(roomNo);
            } else if (i == 3) {
                //退房
                System.out.print("请输入退房编号：");
                int roomNo = s.nextInt();
                hotel.exit(roomNo);
            } else if (i == 0) {
                //退出系统
                System.out.print("再见，欢迎下次再来");
                return;
            } else {
                //出错了
            }
        }
    }
}
