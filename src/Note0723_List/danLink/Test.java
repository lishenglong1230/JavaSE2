package Note0723_List.danLink;

public class Test {
    public static void main(String[] args) {
        Link link=new Link();
        link.add("abc");
        link.add("def");
        link.add("xyz");
        //获取元素个数
        System.out.println(link.size());//3
    }
}
