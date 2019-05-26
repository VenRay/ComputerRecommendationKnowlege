import java.util.Scanner;

/**
 * 使用Scanner在程序需要的时候输入参数
 * */
public class TestScanner {
    
    public static void main(String[] args) {
        
        /**
         * 写一个输出个人信息的小例子
         * */
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("/n");
        System.out.println("欢迎来到冲出地球的博客，我是冲出地球^_^");
        System.out.println("请问你叫什么名字呢？");
        String name = sc.nextLine();
        System.out.println("请问你来自哪里呢？");
        String area = sc.nextLine();
        System.out.println("好的，你来自" + area + ",那么，你们那有什么美食吗？");
        String food = sc.nextLine();
        System.out.println("好的，那么我来复述一下你的信息：");
        System.out.println("你叫" + name + ",来自于：" + area);
        System.out.println("你们那最好吃的东西是：" + food);
        System.out.println("对吧~~");
    }
}