package Note0614_Array.Homework;

public class MyStackTest {
    public static void main(String[] args) {
        //创建一个栈对象，初始化容量是10个
        MyStack stack=new MyStack();
        stack.push(new Object());//压栈java.lang.Object@1b6d3586元素成功，栈帧指向0
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());//最后压入的。最先弹出来。（这个才符合栈的数据结构。）

        stack.push(new Object());//压栈失败，栈已满！

        //弹栈
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        stack.pop();

    }
}
