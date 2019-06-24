package demo1;

import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个数");
        int num1 = sc.nextInt();
        System.out.println("输入第二个数");
        int num2 = sc.nextInt();

        String num3 = xiangdeng(num1, num2);
        System.out.println(num3);
    }

    public static String xiangdeng(int num1, int num2) {
        return (num1 == num2) ? "相等" : "不相等";
    }
}
