package demo1;
import java.util.Scanner;
public class a1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int num1 = sc.nextInt();
        System.out.println("请输入第一个数：");
        int num2 = sc.nextInt();

        int num3 = bijiao(num1,num2);
        System.out.println("较大值是：" + num3);
    }
    public static int bijiao(int num1,int num2){
        return(num1>num2)?num1:num2;
    }
}
