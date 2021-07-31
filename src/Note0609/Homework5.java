package Note0609;
/*
   定义名为MyTime的类其中应有三个整型hour minute second
   定义display方法用于将时间信息打印出来。
   为MyTime类添加以下方法
   addSecond(int sec)
   addMinute(int min)
   addHour(int hou)
   subSecond
    */
public class Homework5 {
    public static void main(String[] args) {
        MyTime t1=new MyTime();
        t1.display();
        MyTime t2=new MyTime(13,20,50);
        t2.display();//13时20分50秒
        t2.addSecond(5);
        t2.display();//13时20分55秒
        t2.addSecond(6);
        t2.display();//13时21分1秒

        t2.addSecond(59);
        t2.display();//13时22分0秒
        t2.addSecond(121);
        t2.display();//13时24分1秒
    }
}
class MyTime{
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }


    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public int getSecond() {
        return second;
    }
    public void setSecond(int second) {
        this.second = second;
    }

    public void display(){
        System.out.println(this.hour+"时"+this.minute+"分"+this.second+"秒");
    }
    public void addSecond(int sec){
        //this.setSecond(原来秒+sec);
        int oldSec=this.getSecond();
        int newSec=oldSec+sec;
        if(newSec<60){
            this.setSecond(newSec);
        }else if(newSec==60){
            //总的秒数等于60
            this.addMinute(1);
            this.setSecond(0);
        }else {
            //总的秒数大于60
            int newMinute=newSec/60;//121/60=2
            this.addMinute(newMinute);
            this.setSecond(newSec%60);
        }
    }
    public void addMinute(int min){
        this.setMinute(this.getMinute()+min);
    }
    public void addHour(int hou){

    }
    public void subSecond(int sec){

    }
    public void subMinute(int min){

    }
    public void subHour(int hou){

    }
}
