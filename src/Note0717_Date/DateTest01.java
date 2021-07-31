package Note0717_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
java对日期的处理
 */
public class DateTest01 {
    public static void main(String[] args) throws Exception{
        //获取系统当前时间
        //直接调用无参数构造方法就行
        Date nowTime = new Date();
        //java.util.Date类的的toString()方法已经被重写了。
        //输出的应该不是一个对象的内存地址，应该是一个日期字符串。
        System.out.println(nowTime);//Fri Jul 17 16:27:54 CST 2020

        //日期可以格式化吗？
        //将日期类型Date，按照指定的格式进行转换：Date --转换成具有一定格式的日期字符串-->String
        //SimpleDateFormat是java.text包下的。专门负责日期格式化的。
        /*
        yyyy 年（年是4位）
        MM 月（月是2位）
        dd 日
        HH 时
        mm 分
        ss 秒
        SSS 毫秒（毫秒3位，最高999.1000毫秒代表1秒）
        注意：在日期格式中，除了y M d H m s S这些字符不能随便写之外，剩下的符号格式自己随意组织。
         */
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String nowTimeStr = sdf.format(nowTime);
        System.out.println(nowTimeStr);//2020-07-17 16:41:54 979

        //假设现在有一个日期字符串String，怎么转换成Date类型？
        //注意：字符串的日期格式和SimpleDateFormat对象指定的日期格式要一致。不然会出现异常：java.text.ParseException
        String time="2008-08-08 08:08:08 888";
        SimpleDateFormat sdf2= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date dateTime = sdf2.parse(time);
        System.out.println(dateTime);//Fri Aug 08 08:08:08 CST 2008


    }
}
