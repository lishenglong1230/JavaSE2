package Note0718_enum;

public class SwitchTest {
    public static void main(String[] args) {
        //switch语句支持枚举类型
        switch (Season.AUTUMN){
            //必须省略Season
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }
    }
}
