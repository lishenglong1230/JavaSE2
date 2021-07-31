package Note0713_String.StringTest05;

public class StringTest05 {
    public static void main(String[] args) {
        //String类当中常用的方法。
        //1、char charAt(int index)
        char c="中国人".charAt(1);//"中国人"是一个字符串String对象。只要是对象就能“点.”
        System.out.println(c);//国

        //字符串之间比较大小不能直接使用 > < ,需要使用compareTo方法。
        int result="abc".compareTo("abc");
        System.out.println(result);//0

        int result2="abcd".compareTo("abce");
        System.out.println(result2);//-1

        int result3="abce".compareTo("abcd");
        System.out.println(result3);//1

        //拿着字符串第一个字母和后面的字符串的第一个字母比较。能分胜负就不再比较了。
        System.out.println("xyz".compareTo("yxz"));//-1

        //判断前面的字符串中是否包含后面的子字符串
        System.out.println("HelloWorld.java".contains(".java"));//true
        System.out.println("http://www.baidu.com".contains("https://"));//false

        //判断当前字符串是否以某个字符串结尾。
        System.out.println("test.txt".endsWith(".java"));//false
        System.out.println("test.txt".endsWith(".txt"));//true

        //判断两个字符串是否相等个，并且同时忽略大小写。
        System.out.println("ABc".equalsIgnoreCase("abC"));//true

        //将字符串对象转换成字节数组
        byte[] bytes="abcdef".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        //判断某个子字符串在当前字符串中第一次出现处的索引。
        System.out.println("oraclejavac++.netc#phppythonjavaoraclec++".indexOf("java"));//6
        //判断某个子字符串子当前字符串中最后一次出现的索引（下标）
        System.out.println("oraclejavac++javac#phpjavapython".lastIndexOf("java"));//22

        //判断某个字符串是否为空
        String s="";
        System.out.println(s.isEmpty());//true 如果s为null 则会空指针异常

        //判断数组长度和判断字符串长度不一样
        //判断数组长度是length属性，判断字符串的长度是length()方法。
        System.out.println("abc".length());//3
        System.out.println("".length());//0

        //String replace(CharSequence target, CharSequence replacement)
        //替换
        //String的父接口就是：CharSequence
        String newString = "http://www.baidu.com".replace("http://","https://");
        System.out.println(newString);//https://www.baidu.com
        //把以下字符串中的"="替换成":"
        String newString2 = "name=zhangsan&password=123&age=20".replace("=",":");
        System.out.println(newString2);

        //拆分字符串
        String[] ymd="1980-10-11".split("-");//"1980-10-11"以“-”分隔符进行拆分。
        for (int i = 0; i < ymd.length; i++) {
            System.out.println(ymd[i]);
        }

        String param = "name=zhangsan&password=123&age=20";
        String[] params=param.split("&");
        for (int i = 0; i < params.length; i++) {
            System.out.println(params[i]);
        }


        //判断某个字符串是否以某个字符串开始
        System.out.println("http://www.baidu.com".startsWith("http"));//true
        System.out.println("http://www.baidu.com".startsWith("https"));//false

        //截取字符串
        System.out.println("http://www.baidu.com".substring(7));//www.baidu.com 从7开始 参数是起始下标
        System.out.println("http://www.baidu.com".substring(7,10));//www  左闭右开 不包含10

        //将字符串转换成char数组
        char[] chars="我是中国人".toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        //转换为小写
        System.out.println("ABCDefKXyz".toLowerCase());
        //转换成大写
        System.out.println("ABCDefKXyz".toUpperCase());

        //去除字符串"前后"空白
        System.out.println("        hello      world     ".trim());//hello      world

        //String中只有一个方法是静态的，不需要new对象
        //这个方法叫做valueOf
        //作用：将"非字符串"转换成"字符串"
        //String s1=String.valueOf(true);
        //String s1=String.valueOf(100);
        //String s1=String.valueOf(3.14);

        //这个静态的valueOf()方法，参数是一个对象的时候，会自动调用该对象的toString()方法吗？会
        String s1=String.valueOf(new Customer());
        //System.out.println(s1);//Note0713.StringTest05.Customer@1b6d3586 没有重写
        System.out.println(s1);//我是一个VIP客户！！！！

        //本质上System.out.println()这个方法在输出任何数据的时候都是先转换成字符串，再输出。输出引用的时候，会调用toString()方法
    }
}
class Customer {
    //重写toString()方法
    public String toString(){
        return "我是一个VIP客户！！！！";
    }
}


